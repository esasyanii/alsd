import java.util.*;

public class DosenMain06 {
    static List<Dosen06> daftarDosen = new ArrayList<>();

    public static void main(String[] args) {
        daftarDosen.add(new Dosen06("0987", "Daysyani", "daysyani@polinema.ac.id", 2023, "TI"));
        daftarDosen.add(new Dosen06("6543", "Sophi", "sophi@polinema.ac.id", 2022, "SIB"));
        daftarDosen.add(new Dosen06("2109", "Masayu", "masayu@polinema.ac.id", 2024, "PPLS"));
        daftarDosen.add(new Dosen06("8765", "Lili", "lili@polinema.ac.id", 2021, "TI"));

        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu Data Dosen:");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Urutkan Berdasarkan NIDN (Ascending)");
            System.out.println("3. Cari Berdasarkan Nama");
            System.out.println("4. Urutkan Berdasarkan Masa Kerja (Descending)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt(); scanner.nextLine();

            switch (pilihan) {
                case 1 -> tampilkanSemuaDosen();
                case 2 -> {
                    selectionSortByNIDN();
                    tampilkanSemuaDosen();
                }
                case 3 -> {
                    System.out.print("Masukkan nama yang dicari: ");
                    cariDosenByNama(scanner.nextLine());
                }
                case 4 -> {
                    sortByMasaKerjaDescending();
                    tampilkanSemuaDosen();
                }
            }
        } while (pilihan != 0);
        scanner.close();
    }

    static void tampilkanSemuaDosen() {
        for (Dosen06 d : daftarDosen) d.tampilkanData();
    }

    //jenis sortingnya Selection Sort 
    //berdasarkan NIDN (ascending)
    static void selectionSortByNIDN() {
        int n = daftarDosen.size();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (daftarDosen.get(j).nidn.compareTo(daftarDosen.get(minIdx).nidn) < 0) {
                    minIdx = j;
                }
            }
            Collections.swap(daftarDosen, i, minIdx);  // Tukar posisi dosen
        }
    }

    //jenis algoritma searchingnya Linear Search 
    //berdasarkan Nama
    static void cariDosenByNama(String nama) {
        boolean ditemukan = false;
        for (Dosen06 d : daftarDosen) {
            if (d.nama.equalsIgnoreCase(nama)) {
                d.tampilkanData();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Dosen tidak ditemukan.");
    }

    //jenis sortingnya Selection Sort 
    //berdasarkan Masa Kerja (descending)
    static void sortByMasaKerjaDescending() {
        int n = daftarDosen.size();
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (daftarDosen.get(j).getMasaKerja() > daftarDosen.get(maxIdx).getMasaKerja()) {
                    maxIdx = j;
                }
            }
            Collections.swap(daftarDosen, i, maxIdx);  // Tukar posisi dosen
        }
    }
}
