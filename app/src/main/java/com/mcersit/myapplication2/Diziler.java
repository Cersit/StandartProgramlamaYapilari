package com.mcersit.myapplication2;

import java.util.Arrays;

public class Diziler {
    public static void main (String args[]){
     String sehirler [] =   {"bursa","izmir", "ankara","kars","trabzon"};

       for (String s :sehirler){
            System.out.println(s);
        }

        int sayilar [] = {1,4,6,8,67,32};
           Arrays.sort(sayilar);
           for(int x:sayilar){
           System.out.println(x);
}

    }
}
