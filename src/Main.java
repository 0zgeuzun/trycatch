import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Diziyi manuel olarak tanımla
        int[] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        // Kullanıcıdan indeks al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir indeks girin: ");
        int index = scanner.nextInt();

        // Metodu çağır ve sonucu yazdır
        try {
            int result = getElementAtIndex(array, index);
            System.out.println("İndeksteki eleman: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz indeks! Dizi boyutunu aşmayan bir indeks giriniz.");
        }
    }

    // Belirli bir indeksteki dizi elemanını döndüren metot
    public static int getElementAtIndex(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        // Verilen indeks, dizinin boyutunu aşıyorsa ArrayIndexOutOfBoundsException hatası fırlat
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }
}