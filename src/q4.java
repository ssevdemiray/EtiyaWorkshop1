//kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşitse mükemmel sayıdır.
public class q4 {
    public static void main(String[] args) {
        int sayi = 28;  // Kontrol etmek istediğiniz sayıyı buraya yazabilirsiniz
        if (isPerfectNumber(sayi)) {
            System.out.println(sayi + " bir mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " bir mükemmel sayı değildir.");
        }
    }

    // Mükemmel sayıyı kontrol eden fonksiyon
    public static boolean isPerfectNumber(int num) { //burada kullanıcıya bir return yaptığımız fonksiyon tipi ,
        //return edilecek değişken tipiyle aynı olmalıdır.Fonksiyon eğer hiçbir şey return etmiyorsa
        // fonksiyon tipi void olmalıdır.
        if (num < 1) {
            return false;
        }
        int toplam = 0;
        // Sayının kendisi hariç pozitif bölenlerini bul ve topla
        for (int i = 1; i <= num / 2; i++) { // num/2 koşulu tam bölenlerinin toplamından kendisini hariç tutar.Bunun yerine i<=num deyip en son toplam - num yapılabilir.ama sağlıksız.
            if (num % i == 0) {
                toplam += i;
            }
        }
        // Bölenlerin toplamı sayıya eşitse, mükemmel sayıdır
        return toplam == num; // return den sonra kontrol edilmesi gereken bir şey yazılabilir.
    }
}
