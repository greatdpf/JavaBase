package com.greatdpf.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * className: ListTest
 * description: List 学习
 * author: staring
 * createDate: 2022/3/25
 * version: 1.0
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 增：相比较于 Collection，多了索引
        list.add(0,"a");
        list.add(1,"b");
        list.add(2,"c");
        list.add(3,"d");
        list.add(4,"e");
        list.add(5, "f");

        List<String> l1 = new ArrayList<>();
        l1.add(0, "l1");
        l1.add(1, "l2");
        l1.add(2, "l3");
        l1.add(3, "l4");
        l1.add(4, "l5");
        list.addAll(0, l1);

        for (int i = 0;i < list.size();i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 删
        System.out.println(list.remove(0));

        // 改
        // set(int index, E e)
        list.set(0, "c");
        // subList(int firstIndex, int toIndex) [first, toIndex)
        List<String> l2 = list.subList(0, 2);
        // listIterator()
        ListIterator<String> iterator2 = l2.listIterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();

        // 查
        // get(int index)
        System.out.println(list.get(0));
        // indexOf(Object o)
        System.out.println(list.indexOf("c"));
        // lastIndex(Object o)
        System.out.println(list.lastIndexOf("c"));

        // 判断


        // 迭代
        ListIterator<String> i2 = list.listIterator();
        while (i2.hasNext()) {
            System.out.print(i2.next() + " ");
        }
        System.out.println();


    }
}
