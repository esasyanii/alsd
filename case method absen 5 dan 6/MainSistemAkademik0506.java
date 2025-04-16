//Nama: Atiqah Fathin Fauziyyah. Absen:05. NIM: 244107060031
//Nama: Daysyani Sophi Masayu. Absen: 06. NIM: 244107060153

//import statement
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainSistemAkademik0506 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data Mahasiswa
        Mahasiswa0506 m1 = new Mahasiswa0506("22001", "Ali Rahman", "Informatika");
        Mahasiswa0506 m2 = new Mahasiswa0506("22002", "Budi Santoso", "Informatika");
        Mahasiswa0506 m3 = new Mahasiswa0506("22003", "Citra Dewi", "Sistem Informasi");

        // Data Mata Kuliah
        MataKuliah0506 mk1 = new MataKuliah0506("MK001", "Struktur Data", 3);
        MataKuliah0506 mk2 = new MataKuliah0506("MK002", "Basis Data", 3);
        MataKuliah0506 mk3 = new MataKuliah0506("MK003", "Desain Web", 3);

        // Data Penilaian
        ArrayList<Penilaian0506> daftarNilai = new ArrayList<>();
        daftarNilai.add(new Penilaian0506(m1, mk1, 80, 85, 90)); // 85.5
        daftarNilai.add(new Penilaian0506(m1, mk2, 60, 65, 80)); // 68.5
        daftarNilai.add(new Penilaian0506(m2, mk1, 70, 75, 80)); // 75.5
        daftarNilai.add(new Penilaian0506(m3, mk2, 85, 90, 95)); // 90.5
        daftarNilai.add(new Penilaian0506(m3, mk3, 70, 75, 85)); // 77.0

        //menampilkan menu
        int pilihan;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Buang newline

            switch (pilihan) {
                case 1:
                    // Menampilkan daftar mahasiswa
                    System.out.println("\nDaftar Mahasiswa:");
                    System.out.println(m1);
                    System.out.println(m2);
                    System.out.println(m3);
                    break;
                case 2:
                    // Menampilkan daftar mata kuliah
                    System.out.println("\nDaftar Mata Kuliah:");
                    System.out.println(mk1);
                    System.out.println(mk2);
                    System.out.println(mk3);
                    break;
                case 3:
                    // Menampilkan data penilaian
                    System.out.println("\nData Penilaian:");
                    for (Penilaian0506 p : daftarNilai) {
                        System.out.println(p);
                    }
                    break;
                case 4:
                    // Mengurutkan mahasiswa berdasarkan nilai akhir
                    System.out.println("\nData Penilaian (Urut Nilai Akhir Tertinggi):");
                    ArrayList<Penilaian0506> nilaiSorted = new ArrayList<>(daftarNilai);
                    Collections.sort(nilaiSorted, new Comparator<Penilaian0506>() {
                        public int compare(Penilaian0506 p1, Penilaian0506 p2) {
                            return Double.compare(p2.hitungNilaiAkhir(), p1.hitungNilaiAkhir());
                        }
                    });
                    for (Penilaian0506 p : nilaiSorted) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    // Mencari mahasiswa berdasarkan NIM
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String cariNim = input.nextLine();
                    boolean ditemukan = false;
                    for (Mahasiswa0506 m : new Mahasiswa0506[]{m1, m2, m3}) {
                        if (m.getNim().equals(cariNim)) {
                            System.out.println("Mahasiswa Ditemukan: " + m);
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Mahasiswa dengan NIM " + cariNim + " tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0); // Ulangi sampai pengguna memilih untuk keluar
    }
}
