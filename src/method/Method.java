/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.util.Scanner;

/**
 *
 * @author maiquynhtrang
 */
public class Method {
    
    //Giai phuong trinh bac 1, bac 2
    public float delta (float a, float b, float c) {
        return (b*b) - (4*a*c);
    }
    public void timNghiemPT(float a, float b, float c) {
        if (a == 0){
            System.out.println("Phuong trinh bac 1 co nghiem: x = " + (-c/b));
        }
        else {
            float delta = this.delta(a, b, c);
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem!");
            }
            else if(delta == 0){
                System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + (-b/(2*a)));
            }
            else {
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1 = " + (float) (-b + Math.sqrt(delta))/(2*a));
                System.out.println("x2 = " + (float) (-b - Math.sqrt(delta))/(2*a));
            }
        }
    }
    
    // Tinh giai thua
    public int giaiThua (int gt) {
        int result = gt;
        while(gt >= 2) {
            result = result * (gt-1);
            --gt;
        }
        return result;
    }
    
    // Tim cac so chia het cho 7 nhung khong chia het chp 5 tu 20-200
    public void find (int soChiaHet, int soKhongCH){
        int start = 20;
        int end = 200;
        for(int i = start; i <= end; i++){
            if((i % soChiaHet == 0) && (i % soKhongCH != 0)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    // So nguyen to nho hon input
    public boolean isPrimeNumber(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void inPrimeNumber(int input) {
        System.out.println("Các số nguyên tố nhỏ hơn n là: ");
        for (int i = 0; i < input; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
