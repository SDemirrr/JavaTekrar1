package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        //kullanicidan 4 basamakli bir sayi alip rakamlar toplamini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("dort basamakli bir tamsayi giriniz");
        int sayi=scan.nextInt();
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;
        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;
        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;
        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;


        System.out.println("rakamlar toplam = "+rakamlarToplami);












    }
}
