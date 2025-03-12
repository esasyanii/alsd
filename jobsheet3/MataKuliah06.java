import java.util.Scanner;

public class MataKuliah06 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah06() {
        // Konstruktor default
    }

    public MataKuliah06(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(Scanner sc) {
        System.out.print("Kode         : ");
        this.kode = sc.nextLine();
        System.out.print("Nama         : ");
        this.nama = sc.nextLine();
        System.out.print("Sks          : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam   : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("--------------------");
    }

    public void cetakInfo(int index) {
        System.out.println("Data Matakuliah ke-" + index);
        System.out.println("Kode         : " + this.kode);
        System.out.println("Nama         : " + this.nama);
        System.out.println("Sks          : " + this.sks);
        System.out.println("Jumlah Jam   : " + this.jumlahJam);
        System.out.println("-------------------------------------------");
    }
}
