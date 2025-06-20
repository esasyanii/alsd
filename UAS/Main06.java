import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPasien06 antrian = new AntrianPasien06();
        RiwayatTransaksi06 riwayat = new RiwayatTransaksi06(100);

        while (true) {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("6. Cari Nama Pasien");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int pilih = Integer.parseInt(sc.nextLine());

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("NIK: ");
                    String nik = sc.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = Integer.parseInt(sc.nextLine());
                    System.out.print("Tinggi Badan (cm): ");
                    double tinggi = Double.parseDouble(sc.nextLine());
                    System.out.print("Berat Badan (kg): ");
                    double berat = Double.parseDouble(sc.nextLine());

                    Pasien06 pasien = new Pasien06(nama, nik, keluhan, umur, tinggi, berat);
                    antrian.tambahPasien(pasien);
                    System.out.println(">> Pasien masuk ke dalam antrian.");
                    break;

                case 2:
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    Pasien06 p = antrian.layaniPasien();
                    if (p == null) {
                        System.out.println("Tidak ada pasien dalam antrian.");
                    } else {
                        System.out.println("Pasien " + p.nama + " dipanggil");

                        System.out.print("Masukkan ID Dokter: ");
                        String idDokter = sc.nextLine();
                        System.out.print("Masukkan Nama Dokter: ");
                        String namaDokter = sc.nextLine();
                        System.out.print("Masukkan Durasi Layanan (jam): ");
                        int durasi = Integer.parseInt(sc.nextLine());

                        Dokter06 dokter = new Dokter06(idDokter, namaDokter);
                        TransaksiLayanan06 t = new TransaksiLayanan06(p, dokter, durasi);
                        riwayat.tambahTransaksi(t);
                        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
                    }
                    break;

                case 4:
                    System.out.println(">> Sisa pasien dalam antrian: " + antrian.sisaAntrian());
                    break;

                case 5:
                    riwayat.tampilkanRiwayat();
                    break;

                case 6:
                    System.out.print("Masukkan nama pasien yang dicari: ");
                    String namaCari = sc.nextLine();
                    antrian.cariPasien(namaCari);
                    break;

                case 0:
                    System.out.println("Keluar dari sistem.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
