package com.example.mummyji.service;

import com.example.mummyji.Palindrome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckPalindrome {
    @Autowired
    Palindrome palindrome;

    public void check(String s) {
        Boolean check = palindrome.findPalindrome(s);
        if (check == true) System.out.println("It is Palindrome");
        else
            System.out.println("It is not palindrome");

    }
}
