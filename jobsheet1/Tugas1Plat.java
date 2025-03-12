import java.util.Scanner;

public class Tugas1Plat {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("          PROGRAM KODE PLAT DAERAH          ");
        System.out.println("===========================================");
        
        // kode plat
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        // nama kota
        String[] KOTA = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", 
                          "SEMARANG", "SURABAYA", "MALANG", "TEGAL"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = scanner.next().toUpperCase().charAt(0);
        
        boolean ditemukan = false;
        
        System.out.println("----------------------------------------------");
        
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                System.out.println("Kota dari plat " + inputKode + " adalah " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan!");
        }
        
        System.out.println("===========================================");
        scanner.close();
    }
}
