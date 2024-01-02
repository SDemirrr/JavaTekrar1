package day03_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim=scan.nextLine();
        isim=isim.substring(0,1).toUpperCase().substring(1, isim.length()-1).toLowerCase();
        System.out.println("isminiz : "+isim);
    }
}
