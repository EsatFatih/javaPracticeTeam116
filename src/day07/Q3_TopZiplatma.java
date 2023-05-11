package day07;

import java.util.Scanner;

public class Q3_TopZiplatma {

    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
    // while code blogu create ediniz.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yukseklik giriniz");
        double yukseklik = scanner.nextInt();

        topuZiplatma(yukseklik);
    }

    public static void topuZiplatma(double yukseklik){

        double toplamYol  =0;
        int sayac  =0 ;
        do {
            toplamYol+=yukseklik;
            toplamYol+=yukseklik*3/4;

            yukseklik = yukseklik*3/4;
            sayac++;
        }while (yukseklik>=1);

        System.out.println("ToplamYol :"+toplamYol+" Yere vurma sayısı : "+sayac);
    }
}
