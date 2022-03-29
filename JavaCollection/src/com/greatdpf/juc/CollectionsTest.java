package com.greatdpf.juc;

import java.util.*;

/**
 * className: ColletctionsTest
 * description: 集合工具类
 *
 *
 *
 * author: staring
 * createDate: 2022/3/28
 * version: 1.0
 */
public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        String s1 = "a";
        String s2 = "b";
        String s3 = new String("c");
        String s4 = "d";
        String s5 = "e";

        // 将 一些元素 添加到 集合中
        Collections.addAll(arrayList, s1, s2, s3, s4, s5);

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.addFirst(6);
        System.out.println(deque);

        // 将 Deque 转换为 AsLIFOQueue
        Queue<Integer> d =  Collections.asLifoQueue(deque);
        d.clear();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        System.out.println(d);
        System.out.println(d.getClass());

        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.getClass());

        ArrayList a1 = new ArrayList();
        a1.add(1);
        a1.add("a");
        a1.add('b');
        // 检查集合是否存放的是否符合某一类，并且返回，如果在存放不同的，将报错；
        Collection collection = Collections.checkedCollection(a1, String.class);
        collection.add("checkedCollection");
        System.out.println(collection);
        System.out.println(collection.getClass());

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("a");
        a2.add("b");
        a2.add("c");
        a2.add("d");
        // disjoint 判断是否完全不相同
        System.out.println(Collections.disjoint(a1, a2));

        // 获取空的列表
        List<Object> objects = Collections.emptyList();
        System.out.println(objects.getClass());

        ArrayList<String> a3 = new ArrayList<>();
        a3.add("a");
        System.out.println(a3);
        ArrayList<String> a4 = new ArrayList<>();
        a4.add("c");
        a4.add("d");
        a4.ensureCapacity(10);
        Collections.copy(a4, a3);
        System.out.println(a4);
        Collections.fill(a4, "c");
        System.out.println(a4);

        System.out.println(Collections.frequency(a3, "a"));

        ArrayList<String> sub = new ArrayList<>();
        sub.add("a");
        sub.add("b");
        sub.add("c");
        sub.add("c");
        sub.add("e");

        System.out.println(Collections.indexOfSubList(sub, a4));

        List<String> list = Collections.synchronizedList(sub);
        System.out.println(list.getClass());

    }

}
