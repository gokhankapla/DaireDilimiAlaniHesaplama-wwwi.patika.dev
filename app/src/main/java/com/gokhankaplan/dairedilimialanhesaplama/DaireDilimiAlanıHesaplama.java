package com.gokhankaplan.dairedilimialanhesaplama;

import java.util.Scanner;

public class DaireDilimiAlanıHesaplama {
    public static void main(String[] args) {
            int r,a;
            double pi = 3.14;

            Scanner input = new Scanner(System.in);
            System.out.println("Yarıçapı giriniz: ");
            r= input.nextInt();
            System.out.println("Merkez acısının olcusunu giriniz: ");
            a = input.nextInt();
            double DDA = (pi*(r*r)*a) / 360;
            System.out.println("Daire Dilimi Alanı:" + DDA);

        }
    }

