package com.springbootmybatis.demo;

import org.junit.Test;

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
}
