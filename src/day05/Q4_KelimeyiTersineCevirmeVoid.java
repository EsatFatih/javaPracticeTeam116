package day05;

import java.util.Scanner;

public class Q4_KelimeyiTersineCevirmeVoid {

    // SORU:kullanıcıdan bir cümle veya kelime girmesini isteyip
    // girilen değeri tersine  yazdıran bir method oluşturun

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle ya da kelime giriniz");

        String kelime = scanner.nextLine();

        tersCevir(kelime);


    }

    public static void tersCevir(String word){

        String bosKova= "";

        for (int i = word.length(); i >=1 ; i--) {

            bosKova+=word.charAt(i-1);

        }

        System.out.println(bosKova);

    }
}
