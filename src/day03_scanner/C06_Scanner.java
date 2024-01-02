package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz : ");
        String isim = scan.nextLine();
        System.out.println("soyisminizi giriniz : ");
        String soyisim = scan.next();
        System.out.println("yasinizi giriniz : ");
        int yas = scan.nextInt();

        System.out.println("girilen bilgiler : " + isim + " " + soyisim + " " + yas);
    }
}
