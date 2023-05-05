package day06;

import java.util.Scanner;

public class AdamAsmacaOyunu {
    /*
        -------ADAM ASMACA OYUNU --------
        Kullanıcı, tahmin etmek istediği harfleri girebilir. Tahmin edilen harfler,
        kelimenin doğru harfleriyle yer değiştirilir ve kalan hak sayısı tutulur.
        Tahmin edilen kelimenin her aşaması ekrana yazdırılır.
        Kullanıcının tahmin hakkı bittiğinde, doğru kelime ekrana yazdırılır
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] kelimeler = {"Java","programlama","selenium","yazilim","degisken","kodlama"};
        String secilenKelime = kelimeler[(int) Math.random()* kelimeler.length]; // kelimeler[3]
        int kelimeLength = secilenKelime.length();
        System.out.println("Lutfen bir harf girip ENTER tusuna basiniz.");
        int can = 5;
        String [] tahminEdilenHarfler = new String[secilenKelime.length()];
        for (int i = 0; i < tahminEdilenHarfler.length; i++) {
            tahminEdilenHarfler[i]="_";

        }
        while (can>0);
    }
}
