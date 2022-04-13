package com.greatdpf.map;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

/**
 * className: MapTest
 * description: Map 练习
 * author: staring
 * createDate: 2022/3/29
 * version: 1.0
 */
public class MapTest {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(2, "a");
        map.put(1, "a");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        map.put(null,"f");
        System.out.println(map.put(null, null));
        System.out.println(map);
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(1, "a1");
        map.putAll(m1);
        System.out.println(map);
        m1.clear();
        System.out.println(m1);
        //





    }
}
