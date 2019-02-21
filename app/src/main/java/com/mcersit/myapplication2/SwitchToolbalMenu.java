package com.mcersit.myapplication2;

import java.util.Scanner;

public class SwitchToolbalMenu {
    public static void main(String args[]) {
        Scanner tarayici = new Scanner(System.in);
        System.out.println("(1) Sil ");
        System.out.println("(2) Güncelle ");
        System.out.println("(3) Yedekle ");
        for (int i = 5; i > 0; i--) {
            System.out.println("hakkınız kaldı"+i);
            int tercih = tarayici.nextInt();


            switch (tercih) {
                case 1:
                    System.out.println("ver silindi");
                    break;
                case 2:
                    System.out.println("veri güncellendi");
                    break;
                case 3:
                    System.out.println("veri yedeklendi");
                    break;
                default:
                    System.out.println("Böyle bir seçim yok");
                    break;
            }

        }
    }
}