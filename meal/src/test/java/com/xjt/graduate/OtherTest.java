package com.xjt.graduate;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xiongjieteng
 * @date 2019-02-21 - 16:05
 */
public class OtherTest{

    private LinkedList<Object> list = new LinkedList<>();
    private final int maxSize;
    private final int minSize = 0;
    private AtomicInteger count = new AtomicInteger(0);
    public OtherTest(int maxSize){
        this.maxSize = maxSize;
    }
    private final Object lock = new Object();

    public void put(Object obj){
        synchronized (lock) {
            while (count.get() == this.maxSize) {
                try {
                    lock.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            list.add(obj);
            count.incrementAndGet();
            lock.notify();
            System.out.println("新添加元素："+obj);
        }
    }
    public Object get(){
        Object res = null;
        synchronized (lock){
            while (count.get() == this.minSize){
                try{
                    lock.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            res = list.removeFirst();
            count.decrementAndGet();
            lock.notify();
        }
        return res;
    }

    public int getSize(){
        return count.get();
    }
    public static void main(String[] args) {
        final OtherTest queue = new OtherTest(5);
        queue.put(1);
        queue.put(2);
        queue.put(3);
        queue.put(4);
        queue.put(5);
        System.out.println("当前容量："+queue.getSize());
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                queue.put(6);
                System.out.println("put success!");
                queue.put(7);
                System.out.println("put success!");
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("get:"+queue.get());
                System.out.println("get:"+queue.get());
                System.out.println("get:"+queue.get());
            }
        });

        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (Exception e){
            e.printStackTrace();
        }

        t2.start();

    }
}
