import java.util.Scanner;

public class MainPangkat06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah elemen
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        // Membuat array objek Pangkat06
        Pangkat06[] png = new Pangkat06[elemen];

        // Mengisi array objek dengan input pengguna
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = input.nextInt();

            png[i] = new Pangkat06(basis, pangkat);
        }

        // Menampilkan hasil perhitungan dengan Brute Force
        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat06 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        }

        // Menampilkan hasil perhitungan dengan Divide & Conquer
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat06 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }

        input.close();
    }
}
