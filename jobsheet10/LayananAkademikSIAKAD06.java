import java.util.Scanner;
public class LayananAkademikSIAKAD06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan06 antrian = new AntrianLayanan06(5);
        int pilihan;
        do {
            System.out.println("=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Jumlah Mahasiswa dalam Antrian");
            System.out.println("5. Lihat Mahasiswa Terdepan");
            System.out.println("6. Cek Antrian Paling Belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.next();
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("Prodi: ");
                    String prodi = sc.next();
                    System.out.print("Kelas: ");
                    String kelas = sc.next();
                    Mahasiswa06 mhs = new Mahasiswa06(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa06 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 5:
                    antrian.lihatTerdepan();
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
