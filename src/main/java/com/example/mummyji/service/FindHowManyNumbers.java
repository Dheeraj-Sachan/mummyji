package com.example.mummyji.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FindHowManyNumbers {
    int[] a = {1, 2, 3, 4, 57, 5, 4, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public void find() {
        int i = 1;
        System.out.println("The length is   " + a.length);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int f : a) {

            if (hashMap.get(f) == null) {
                hashMap.put(f, i);
            } else {
                hashMap.put(f, i++);
                if (a.length / 2 < i) {
                    System.out.println(" The Number is " + f+" and it is these many times "+i);
                    break;
                }
            }
        }
        System.out.println(hashMap);
    }
}