package com.springbootmybatis.demo;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author xiongjieteng
 * @date 2019-02-22 - 12:25
 */
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
}
