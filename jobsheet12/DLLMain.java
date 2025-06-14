import java.util.Scanner;
public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedList06 list = new DoubleLinkedList06(); // Atau sesuaikan dengan versi kamu
        Scanner scan = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah data setelah NIM tertentu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            while (!scan.hasNextInt()) {
                System.out.println("Masukkan angka yang valid!");
                scan.next(); // buang input tidak valid
                System.out.print("Pilih menu: ");
            }
            pilihan = scan.nextInt();
            scan.nextLine(); // buang newline
            switch (pilihan) {
                case 1 -> list.addFirst(inputMahasiswa(scan));
                case 2 -> list.addLast(inputMahasiswa(scan));
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node06 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data dengan NIM tersebut tidak ditemukan.");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM setelah data ini akan ditambahkan: ");
                    String nimKey = scan.nextLine();
                    Mahasiswa06 mhs = inputMahasiswa(scan);
                    list.insertAfter(nimKey, mhs);
                }
                case 0 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);

        scan.close();
    }
    

    public static Mahasiswa06 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();

        double ipk = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Masukkan IPK: ");
            try {
                ipk = Double.parseDouble(scan.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Format IPK tidak valid. Gunakan angka, contoh: 3.75");
            }
        }

        return new Mahasiswa06(nim, nama, kelas, ipk);
    }

    
}
