import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kaç ürün alacağını soralım.
        System.out.print("Kaç adet ürün almak istiyorsunuz? ");
        int urunSayisi = scanner.nextInt();

        double toplamTutar = 0;

        // Ürün fiyatlarını al ve toplam tutarı hesaplayalım.
        for (int i = 1; i <= urunSayisi; i++) {
            System.out.print(i + ". ürünün fiyatı nedir? ");
            double fiyat = scanner.nextDouble();
            toplamTutar += fiyat;
            //toplamTutar = toplamTutar + fiyat;
        }

        // Toplam tutarı yazdıralım.
        System.out.println("Toplam alışveriş tutarı: " + toplamTutar + " TL");

        scanner.close();
    }
}
