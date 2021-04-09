package com.wx.bean;

import lombok.Data;

/*
 *@name: User
 *@author: wang xing
 *@date:2021/4/9 8:44
 *@description:
 */
@Data
public class User implements Comparable<User> {

    private String name;

    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 测试字段排序
     * @param u
     * @return
     */
    @Override
    public int compareTo(User u) {
        int x = 0;
        if (this.age >= 60 && u.getAge() < 60) {
            x = 1;
        } else {
            x = u.getAge() - this.age;
        }
        return x;
    }
}
