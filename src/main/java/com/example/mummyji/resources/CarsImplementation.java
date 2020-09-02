package com.example.mummyji.resources;

import com.example.mummyji.Cars;
import com.example.mummyji.service.Doctor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarsImplementation {
    List<Doctor> dheeraj= Arrays.asList(new Doctor(101, "Preeti","Yashoda"),new Doctor(102,"Dheeraj","Max"),new Doctor(103,"Vivek","KIMS"));
    Cars cars1=new Cars(){

        @Override
        public void clean() {
            System.out.println("I am in inner class");
        }
    };

    public void d(){
        cars1.clean();
        for(Doctor f:dheeraj){
            System.out.println(f);
        }
    }

}
