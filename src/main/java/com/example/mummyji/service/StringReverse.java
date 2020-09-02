package com.example.mummyji.service;

import org.springframework.stereotype.Service;

@Service
public class StringReverse {
    String s = "Dheeraj Sachan";
    String rev = "";

    public void reverse() {
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }

}
