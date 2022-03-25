package com.greatdpf.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * className: CollectionTest
 * description: Collection 类学习
 * author: staring
 * createDate: 2022/3/25
 * version: 1.0
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        // 增
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        Collection<String> c1 = new ArrayList<>();
        c1.add("c");
        c1.add("c1");
        c1.add("c2");
        c1.add("c3");
        collection.addAll(c1);

        // 删
        collection.remove("c");
        collection.removeAll(c1);
        // collection.retainAll(c1);
        // collection.clear();

        // 遍历
        for (String s : collection) {
            System.out.print(s + " : ");
        }
        System.out.println();

        // 改

        // 查
        System.out.println(collection.size());

        // 判断
        System.out.println(collection.contains("b"));
        collection.addAll(c1);
        System.out.println(collection.containsAll(c1));
        System.out.println(collection.isEmpty());

        // 其他


        // 迭代
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " : ");
        }
        System.out.println();

    }
}
