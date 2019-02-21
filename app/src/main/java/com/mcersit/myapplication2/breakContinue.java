package com.mcersit.myapplication2;

public class breakContinue {
    public static void main(String args[]){
        for (int i=0; i<6; i++){

            if(i==3){
               // break;  0 1 2
                continue; // 0 1 2  4 5   // 1 defaya mahsus o işi yaptırmıyor
            }
            System.out.println("index"+i);
        }
    }
}
