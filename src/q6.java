import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Öğrenci sayısını giriniz: ");
        int ogrenciSayisi = scanner.nextInt();
        scanner.nextLine();  // İlk nextInt'den sonra kalan newline karakterini temizleyelim

        String ogrenciAdi, ogrenciSoyadi;
        int sinav1, sinav2, sinav3;

        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println((i + 1) + ". öğrencinin adını giriniz:");
            ogrenciAdi = scanner.nextLine();

            System.out.println((i + 1) + ". öğrencinin soyadını giriniz:");
            ogrenciSoyadi = scanner.nextLine();

            System.out.println((i + 1) + ". öğrencinin 1. sınav notunu giriniz:");
            sinav1 = scanner.nextInt();

            System.out.println((i + 1) + ". öğrencinin 2. sınav notunu giriniz:");
            sinav2 = scanner.nextInt();

            System.out.println((i + 1) + ". öğrencinin 3. sınav notunu giriniz:");
            sinav3 = scanner.nextInt();
            scanner.nextLine(); // Sonraki giriş için scanner'ı temizle.

            // Not ortalamasını hesapla ve yazdıralım.
            double ortalama = (sinav1 + sinav2 + sinav3) / 3.0;
            System.out.println(ogrenciAdi + " " + ogrenciSoyadi + " isimli öğrencinin not ortalaması: " + ortalama);
        }

        scanner.close();
    }
}