import java.util.Scanner;

public class Tugas3Matkul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("        JADWAL KULIAH     ");
        System.out.println("============================================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        String[] mataKuliah = new String[jumlahMatkul];
        int[] sks = new int[jumlahMatkul];
        int[] semester = new int[jumlahMatkul];
        String[] hari = new String[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("--------------------------------------------");
            System.out.printf("Masukkan data untuk mata kuliah ke-%d%n", (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            mataKuliah[i] = scanner.nextLine();

            System.out.print("Jumlah SKS: ");
            sks[i] = scanner.nextInt();

            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            System.out.print("Hari Kuliah: ");
            hari[i] = scanner.nextLine();
        }

        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1 -> tampilkanSeluruhJadwal(mataKuliah, sks, semester, hari);
                case 2 -> {
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String cariHari = scanner.nextLine();
                    tampilkanJadwalPerHari(mataKuliah, sks, semester, hari, cariHari);
                }
                case 3 -> {
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int cariSemester = scanner.nextInt();
                    tampilkanJadwalPerSemester(mataKuliah, sks, semester, hari, cariSemester);
                }
                case 4 -> {
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String cariMatkul = scanner.nextLine();
                    cariMataKuliah(mataKuliah, sks, semester, hari, cariMatkul);
                }
                case 5 -> System.out.println("Terima kasih telah menggunakan program ini!");
                default -> System.out.println("Pilihan tidak tersedia. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }

    static void tampilkanMenu() {
        System.out.println("============================================");
        System.out.println("                    MENU                    ");
        System.out.println("============================================");
        System.out.println("1. Lihat seluruh jadwal kuliah");
        System.out.println("2. Cari jadwal berdasarkan hari");
        System.out.println("3. Cari jadwal berdasarkan semester");
        System.out.println("4. Cari mata kuliah");
        System.out.println("5. Keluar");
        System.out.println("============================================");
    }

    static void tampilkanSeluruhJadwal(String[] matkul, int[] sks, int[] semester, String[] hari) {
        System.out.println("============================================");
        System.out.println("            JADWAL MATA KULIAH              ");
        System.out.println("============================================");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%s - %d SKS - Semester %d - %s%n", matkul[i], sks[i], semester[i], hari[i]);
        }
    }

    static void tampilkanJadwalPerHari(String[] matkul, int[] sks, int[] semester, String[] hari, String targetHari) {
        System.out.println("============================================");
        System.out.printf("      JADWAL KULIAH HARI %s%n", targetHari.toUpperCase());
        System.out.println("============================================");
        boolean ditemukan = false;
        for (int i = 0; i < matkul.length; i++) {
            if (hari[i].equalsIgnoreCase(targetHari)) {
                System.out.printf("%s - %d SKS - Semester %d%n", matkul[i], sks[i], semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Tidak ada jadwal pada hari tersebut.");
    }

    static void tampilkanJadwalPerSemester(String[] matkul, int[] sks, int[] semester, String[] hari, int targetSemester) {
        System.out.println("============================================");
        System.out.printf("       JADWAL KULIAH SEMESTER %d%n", targetSemester);
        System.out.println("============================================");
        boolean ditemukan = false;
        for (int i = 0; i < matkul.length; i++) {
            if (semester[i] == targetSemester) {
                System.out.printf("%s - %d SKS - Hari: %s%n", matkul[i], sks[i], hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Tidak ada mata kuliah untuk semester ini.");
    }

    static void cariMataKuliah(String[] matkul, int[] sks, int[] semester, String[] hari, String targetMatkul) {
        System.out.println("============================================");
        System.out.printf("     PENCARIAN: %s%n", targetMatkul.toUpperCase());
        System.out.println("============================================");
        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i].equalsIgnoreCase(targetMatkul)) {
                System.out.printf("%s - %d SKS - Semester %d - Hari: %s%n", matkul[i], sks[i], semester[i], hari[i]);
                return;
            }
        }
        System.out.println("Mata kuliah tidak ditemukan.");
    }
}
