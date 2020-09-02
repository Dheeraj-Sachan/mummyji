package com.example.mummyji.service;

import org.springframework.stereotype.Service;

@Service
public class AddtionOfArrayNumbers {
    int[] x={1,2,3,4,5,6,7,8,9,10};
    int y=0;
    public void add(){
        for(int f:x){
            y=y+f;
        }
        System.out.println(y);
    }
}
