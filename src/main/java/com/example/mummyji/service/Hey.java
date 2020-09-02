package com.example.mummyji.service;

import org.springframework.stereotype.Service;

@Service
public class Hey {
   static int[] x={21,23,21,234,3,2,32};
    public void dancing(){
        for(int t:x){
            System.out.print("Original "+t+"....");
            int k=t+1;
            System.out.println("Increased "+k);

        }
    }
}
