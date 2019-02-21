package com.mcersit.myapplication2;

import java.sql.Statement;

public class ifCalisma {
    public static void main(String args[]){

        int yas =17;
        String isim = "ahmet";
        if (yas > 18){
            System.out.println("Resitşiniz");
        }
        else{
            System.out.println("Reşit değilsiniz");
        }
        if(isim.equals("ahmet")){
            System.out.println("Merhaba Ahmet");
        }
        else {
            System.out.println("Merhaba ahmet olmayan");
        }
    }
}
