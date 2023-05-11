package day06;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if (i == 3){
                continue;
            }
            System.out.print(i+""); // 1 2 4 5    continue kullandıgımız icin 3'u almadı
        }
        System.err.println("Islem  tamam");
    }
}
