import java.util.Scanner;

public class MahasiswaDemo06Modif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi06Modif list = new MahasiswaBerprestasi06Modif();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        // Input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine(); // Membersihkan buffer

            Mahasiswa06Modif m = new Mahasiswa06Modif(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        // Menampilkan data sebelum sorting
        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        // Sorting berdasarkan IPK (descending)
        list.bubbleSort();

        // Menampilkan data setelah sorting
        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.tampil();

        input.close();
    }
}
