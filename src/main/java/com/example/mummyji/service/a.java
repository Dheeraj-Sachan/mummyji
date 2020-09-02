package com.example.mummyji.service;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;

public class a extends Add {
    ArrayList l = new ArrayList();

    public void d() {
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        l.add("F");

        System.out.println(l);
        System.out.println("*************");

        l.addAll(l);
        System.out.println(l);

        System.out.println("*************");
        l.remove(2);
        System.out.println(l);

        l.add(1, "Z");
        System.out.println(l);
        System.out.println("*************");
        System.out.println("This is child");
        for (Object b : l) {
            System.out.println(b);
            String g = (String) b;
            System.out.println("For Each  " + g);
        }
    }
}
