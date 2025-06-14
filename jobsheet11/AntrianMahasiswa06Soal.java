import java.util.Scanner;

public class AntrianMahasiswa06Soal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Antrian06Soal antrian = new Antrian06Soal();
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian (Daftar)");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Kosongkan Antrian");
            System.out.println("5. Tampilkan Antrian Terdepan");
            System.out.println("6. Tampilkan Antrian Terakhir");
            System.out.println("7. Tampilkan Jumlah Antrian");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("NIM Mahasiswa: ");
                    String nim = input.nextLine();
                    antrian.enqueue(nama, nim);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 4:
                    antrian.clear();
                    break;
                case 5:
                    antrian.tampilkanAntrianTerdepan();
                    break;
                case 6:
                    antrian.tampilkanAntrianTerakhir();
                    break;
                case 7:
                    antrian.tampilkanJumlah();
                    break;
                case 8:
                    antrian.tampilkanSemua();
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        input.close();
    }
}
