import java.util.Scanner;

public class MataKuliahDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta user untuk menentukan jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = Integer.parseInt(sc.nextLine());

        // Membuat array dengan ukuran yang diinputkan user
        MataKuliah06[] arrayOfMataKuliah = new MataKuliah06[jumlahMataKuliah];

        // Input data untuk setiap mata kuliah
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("\nMasukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah06();
            arrayOfMataKuliah[i].tambahData(sc);
        }

        // Menampilkan data yang telah diinput
        System.out.println("\n=== Data Matakuliah yang Telah Dimasukkan ===");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            arrayOfMataKuliah[i].cetakInfo(i + 1);
        }

        sc.close();
    }
}
