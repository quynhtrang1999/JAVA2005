/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import entity.PhuongTrinh;
import entity.GiaoThua;
import entity.FindNumber;
import entity.SoNguyenTo;
import java.util.Scanner;
import method.Method;

/**
 *
 * @author maiquynhtrang
 */
public class Main {
    public static void main(String[] args) {
        PhuongTrinh pt = new PhuongTrinh();
        GiaoThua giaithua = new GiaoThua();
        FindNumber fn = new FindNumber();
        SoNguyenTo snt = new SoNguyenTo();
        Method mt = new Method();
        Scanner in = new Scanner(System.in);
        System.out.println("1. Giai phuong trinh");
        System.out.println("2. Tinh giai thua");
        System.out.println("3. Tim so chia het cho 7 va khong chia het cho 5 tu 20-100");
        System.out.println("4. In cac so nguyen to");
        System.out.println("0. Thoat");
        while(true) {
            int choice;
            System.out.print("Moi lua chon: ");
            choice = in.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Moi nhap cac he so cua pt:");
                    pt.setA(in.nextFloat());
                    pt.setB(in.nextFloat());
                    pt.setC(in.nextFloat());
                    mt.timNghiemPT(pt.getA(),pt.getB(),pt.getC());
                    break;
                case 2:
                    System.out.println("Tinh giai thua cua mot so");
                    System.out.print("Nhap input: ");
                    giaithua.setGt(in.nextInt());
                    System.out.println("Giai thua cua input = " + mt.giaiThua(giaithua.getGt()));
                    break;
                case 3:
                    System.out.println("So chia het cho 7 va khong chia het cho 5 tu 20-100");
                    fn.setSoChiaHet(7);
                    fn.setSoKhongCH(5);
                    mt.find(fn.getSoChiaHet(), fn.getSoKhongCH());
                    break;
                case 4:
                    System.out.print("Nhap input: ");
                    snt.setInput(in.nextInt());
                    mt.inPrimeNumber(snt.getInput());
                    break;    
                case 0:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi lua chon lai!!! ");
                    break;
            }
        }
    }
}
