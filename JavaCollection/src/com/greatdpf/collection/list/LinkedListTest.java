package com.greatdpf.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * className: LinkedListTest
 * description: LinkedList 练习
 * 底层：双向链表
 * author: staring
 * createDate: 2022/3/25
 * version: 1.0
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println(linkedList.poll());
        //System.out.println(linkedList.pop());
        System.out.println(linkedList.peek());
        //System.out.println(linkedList.remove());
        //System.out.println(linkedList.element());
        // 增
        linkedList.offer("o1");
        linkedList.offer("o2");
        linkedList.offer("o3");
        linkedList.offerFirst("of4");
        linkedList.offerLast("ol5");

        linkedList.addFirst("af1");
        linkedList.addFirst("af2");
        linkedList.addFirst("af3");
        linkedList.addLast("al1");
        linkedList.addLast("al2");
        linkedList.addLast("al3");

        linkedList.push("p1");
        linkedList.push("p2");
        linkedList.push("p3");

        for(int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();

        // 删
        System.out.println("==== pop peek poll 区别====");
        System.out.println("pop：" + linkedList.pop());
        System.out.println("peek：" + linkedList.peek());
        System.out.println("poll：" + linkedList.poll());
        System.out.println(linkedList);
        System.out.println("=======================");

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());

        // 改

        // 查
        System.out.println("=======查询元素=======");
        System.out.println(linkedList.element());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
        System.out.println("====================");

        // 判断

        // 迭代
        System.out.println("=====逆向迭代======");
        Iterator<String> stringIterator = linkedList.descendingIterator();
        while (stringIterator.hasNext()) {
            System.out.print(stringIterator.next() + " ");
        }
        System.out.println();
        System.out.println("=====顺向迭代======");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
