import java.util.Scanner;
public class DosenMain06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen06 data = new DataDosen06();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Urutkan Data ASC (Usia)");
            System.out.println("4. Urutkan Data DSC (Usia)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = input.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Jenis Kelamin (L/P): ");
                    char jk = input.next().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Masukkan Usia: ");
                    int usia = input.nextInt();

                    Dosen06 dsn = new Dosen06(kode, nama, jenisKelamin, usia);
                    data.tambah(dsn);
                    break;

                case 2:
                    System.out.println("\nData Dosen:");
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    break;

                case 4:
                    data.sortingDSC();
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
            }
        } while (pilihan != 5);

        input.close();
    }
}
