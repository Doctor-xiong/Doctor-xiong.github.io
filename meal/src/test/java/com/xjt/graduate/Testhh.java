package com.xjt.graduate;

import com.xjt.graduate.po.IUserDao;
import com.xjt.graduate.po.Persion;
import com.xjt.graduate.po.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import java.lang.reflect.Proxy;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiongjieteng
 * @date 2019-02-22 - 12:25
 */
@Slf4j
public class Testhh {

    @Test
    public void stringTest(){
        String[] arr = {"aaabc","bbbca"};
        for(String s : arr){
            if (s.startsWith("aaa")){
                System.out.println("yes");
            }
            else if (s.endsWith("ca")){
                System.out.println("no   vvv");
            }
        }
    }

    @Test
    public void inetAddressTest(){
        InetAddress inetAddress = null;
        try {
//            inetAddress = inetAddress.getLocalHost();
//            System.out.println(inetAddress.getAddress());
//            System.out.println(inetAddress.getHostAddress());
            System.out.println(InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void proxyTest() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("com.xjt.graduate.po.Persion");
        Object o = clazz.newInstance();
        String name = "hahah";
        System.out.println(clazz);
        try {
            int num = 1/0;
        }catch (Exception e){
            log.error("error: name={}",name,e);
            log.error("error: name={}"+e,name);
        }
    }
    @Test
    public void listTest(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }
}
