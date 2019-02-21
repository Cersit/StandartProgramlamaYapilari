package com.mcersit.myapplication2;

import java.util.Scanner;

public class DizilerKarne {
    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);

        String dersler [] = new String [3];
        int notlar [] = new int[3];

        for(int i=0; i<dersler.length; i++){
            System.out.println((i+1)+". Seçmeli Dersi giriniz");
            String ders =tarayici.next();
            dersler[i]  =ders;
            System.out.println((i+1)+"dersin notunu giriniz");
            int not = tarayici.nextInt();
            notlar[i]=not;
        }
        int toplam=0;
        for(int k=0; k<notlar.length;k++){
            System.out.println(dersler[k]+" notunuz "+notlar[k]);
            toplam=toplam+notlar[k];

        }
        int ortalama =toplam/dersler.length;
        System.out.println("ortalamanız  "+ortalama );
        if(ortalama >49){
            System.out.println("Sınıfı geçdiniz");
        }
        else {
            System.out.println("Sınıfta kaldınız");
        }
    }
}
