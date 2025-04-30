import java.util.Scanner;

public class SuratDemo06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat06 stack = new StackSurat06(5);

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); // bersihkan newline

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat06 s = new Surat06(idSurat, nama, kelas, jenis, durasi);
                    stack.push(s);
                    System.out.println("Surat diterima: " + s.infoSurat());
                    break;

                case 2:
                    Surat06 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat: " + diproses.infoSurat());
                    }
                    break;

                case 3:
                    Surat06 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir: " + terakhir.infoSurat());
                    }
                    break;

                case 4:
                    System.out.print("Cari nama mahasiswa: ");
                    String cari = scan.nextLine();
                    if (stack.cariSurat(cari)) {
                        System.out.println("Surat ditemukan untuk: " + cari);
                    } else {
                        System.out.println("Surat tidak ditemukan untuk: " + cari);
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);

        scan.close();
    }
}
