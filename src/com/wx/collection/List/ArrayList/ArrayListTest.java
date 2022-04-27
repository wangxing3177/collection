package com.wx.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List objects = new ArrayList<>();
        objects.add(1);
        objects.add("s");
        objects.add("ws");
        objects.add("hah");

        //普通循环
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i));
        }
        System.out.println("====================================");
        //增强for循环
        for (Object o: objects) {
            System.out.println(o);
        }
        System.out.println("====================================");
        //迭代器循环
        Iterator iterator = objects.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
