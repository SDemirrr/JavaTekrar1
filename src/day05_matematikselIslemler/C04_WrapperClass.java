package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String str="Java cok guzel";
        str.toUpperCase();

        int sayi=10;
        //primitive data turlerinin yaninda methodler olmaz
        //Java bazi method'lari kullanabilmemiz icin
        //her bir primitive data turu icin bir Wrapper class olusturmustur

        Integer sayi2=10;
        sayi2.byteValue();
    }
}
