import java.util.Scanner;

public class SoalLayananAkademikSIAKAD06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SoalAntrianLayanan06 antrian = new SoalAntrianLayanan06(10);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Dua Terdepan");
            System.out.println("5. Tampilkan Paling Akhir");
            System.out.println("6. Jumlah Proses KRS");
            System.out.println("7. Jumlah Belum KRS");
            System.out.println("8. Keluar");
            System.out.print("Pilihan: ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    SoalMahasiswa06 mhs = new SoalMahasiswa06(nim, nama, prodi, kelas);
                    antrian.addAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilkanAntrian();
                    break;
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrian.tampilkanPalingAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah KRS: " + antrian.jumlahProsesKRS());
                    break;
                case 7:
                    System.out.println("Belum KRS: " + antrian.jumlahBelumKRS());
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
