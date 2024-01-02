package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi \nsoyisminizi\n ve \nyasinizi \ngiriniz");
        String isim=scan.nextLine(),soyisim=scan.nextLine();
        int yas=scan.nextInt();
        System.out.println("girilen bilgiler : "+isim+" "+soyisim+" "+yas);

    }
}
