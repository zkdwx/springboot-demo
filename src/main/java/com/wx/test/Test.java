package com.wx.test;

/*
 *@name: Test
 *@author: wang xing
 *@date:2021/4/9 8:43
 *@description:
 */

import com.wx.bean.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        User u1=new User("u1",20);
        User u2=new User("u2",50);
        User u3=new User("u3",90);
        User u4=new User("u4",70);
        List<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        Collections.sort(list);
        System.out.println(list);
    }
}

