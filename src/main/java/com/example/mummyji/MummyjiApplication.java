package com.example.mummyji;

import com.example.mummyji.service.CheckPalindrome;
import com.example.mummyji.service.FindHowManyNumbers;
import com.example.mummyji.service.FindtheRepetedLetterInString;
import com.example.mummyji.service.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MummyjiApplication implements CommandLineRunner {
    Scanner s=new Scanner(System.in);

    @Autowired
CheckPalindrome checkPalindrome;


    public static void main(String[] args) {
        SpringApplication.run(MummyjiApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Please enter the the word to check  :");
      String e=  s.nextLine();


        checkPalindrome.check(e);
    }
}
