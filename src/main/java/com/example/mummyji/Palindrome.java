package com.example.mummyji;

import org.springframework.stereotype.Service;

@Service
public class Palindrome {
    Boolean know = true;

    public Boolean findPalindrome(String s) {
        char[] v = s.toCharArray();
        int i = s.length() - 1;
        for (int j = 0; j < s.length(); j++) {
            if (v[j] != v[i])
                know = false;
            i--;
        }
        return know;
    }
}