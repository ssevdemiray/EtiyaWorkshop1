import java.util.Random;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        // Random sınıfını kullanarak rastgele bir sayı üretelim.
        Random random = new Random();
        int rastgeleSayi = random.nextInt(10) + 1;  // 1 ile 10 arasında bir sayı üretelim.

        // Scanner sınıfı ile kullanıcıdan girdi alalım.
        Scanner scanner = new Scanner(System.in);
        int tahmin;

        System.out.println("1 ile 10 arasında bir sayı tahmin ediniz:");

        // Kullanıcı doğru tahmin edene kadar döngüyü sürdürelim.
        while (true) {
            tahmin = scanner.nextInt();  // Kullanıcının tahminini alalım.

            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                break;  // Doğru tahminde döngüden çıkalım.
            } else {
                System.out.println("Yanlış tahmin. Tekrar deneyin:");
            }
        }

        scanner.close();
    }
}