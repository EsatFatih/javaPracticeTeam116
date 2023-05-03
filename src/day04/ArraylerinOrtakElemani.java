package day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylerinOrtakElemani {

    // Iki String array icindeki ayni elemanlari bulan bir java methodu create ediniz


    public static void ortakEleman(){

        // Verilen iki array i karsilastirmak icin size larinin ayni olmasi  gerekiyor
        // veya size ı kucuk olana gore karsilastirmak gerekiyor

        String [] data1 = {"Java","SQL","HTML","Selenium","API","Python","postman","devops"};
        String [] data2 = {"Java","SQL","html","selenium","Api","C#","SoapUI","azure"};

        // karsilastirdigim elemanlari bir arrya icine atayamayiz. cunku ayni olan kac tane
        // eleman var bilmiyoruz yani size ı bilmiyoruz.Bu sebepten List e koymak mantikli

        // Ayni olan elemanlari koymak icin bir List olusturalim

        List<String> ortakElemanlarListesi = new ArrayList<>();

        // inner for loop ile array lerin icerisine girip her bir datayi digerleri yle karsilastir

        for (int i = 0; i < data1.length; i++) {
            for (int j = 0; j < data2.length; j++) {
                if (data1[i].equalsIgnoreCase(data2[j])){
                    ortakElemanlarListesi.add(data1[i]);
                }

            }

        }
        System.out.println("Ortak Elemanlar :" +ortakElemanlarListesi);


    }

    public static void main(String[] args) {

        ortakEleman();
    }

}
