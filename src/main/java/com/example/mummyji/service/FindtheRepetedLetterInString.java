package com.example.mummyji.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FindtheRepetedLetterInString {
    Map<Character, Integer> map = new HashMap();
    int d = 1;
    Integer i=1;

    public void countTheLetters(String s) {


        char[] a = s.toCharArray();
        for (char e : a)
            System.out.println(e);
          System.out.println("*********************");
        for (char c : a) {
            if (map.get(c) == null) {
                d = 1;

                map.put(c, d);
            } else {
                map.put(c, map.get(c)+1);
            }

        }
        System.out.println(map);
    }
}