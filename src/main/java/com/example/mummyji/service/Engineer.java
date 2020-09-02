package com.example.mummyji.service;

import org.springframework.stereotype.Component;

@Component
public class Engineer {

    public static void d(int x) {
        switch (x) {
            case 1:
                System.out.println("This is one");
            case 2:
                System.out.println("This is two");
            case 3:
                System.out.println("This is three");
            case 4:
                System.out.println("This is four");
            case 5:
                System.out.println("This is five");
            default:
                System.out.println("no match ");

        }

    }

}
