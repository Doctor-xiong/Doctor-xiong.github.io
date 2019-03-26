package com.xjt.graduate.po;

import lombok.*;

/**
 * @author xiongjieteng
 * @date 2019-01-24 - 20:40
 */
@Getter
@Setter
public class Persion {
    String name;
    Integer id;

    public Persion() {
    }

    public Persion(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
    public void printPersion(){
        System.out.println("[name:"+name+"  id:"+id+"]");
    }
}
