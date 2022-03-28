package com.greatdpf.collection.list;

import java.util.Vector;

/**
 * className: VectorTest
 * description: 线程安全的
 * author: staring
 * createDate: 2022/3/27
 * version: 1.0
 */
public class VectorTest {
    public static void main(String[] args) {
        // 此类是线程安全的，效率低，并且扩容方式也是1.8之前的，不建议使用
        // 如果非要使用线程安全的集合，建议使用 JUC
        // 所有方法都加入了 synchronized
        Vector<String> vector = new Vector<>();
        vector.addElement("a");
    }
}
