    package com.mcersit.myapplication2;

    import java.util.Scanner;

    public class RepeatNamewithFor {
         public static void main(String args[]){

             Scanner tarayici =new Scanner(System.in);
             System.out.println("İsminizi Giriniz");
             String isim =tarayici.nextLine();

             System.out.println("Tekrarlanma miktarını giriniz");
             int sayi =tarayici.nextInt();

             for(int i =1; i<=sayi; i++){
                 System.out.println(isim+"---"+i);
             }
         }
    }
