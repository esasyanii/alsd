import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Program Menghitung Nilai Akhir ");
        System.out.println("============================");
        
        // Input nilai dari pengguna
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = scanner.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = scanner.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = scanner.nextDouble();
        
        System.out.println("============================");
        System.out.println("============================");
        
        // Cek validitas nilai
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
            System.out.println("============================");
            System.out.println("============================");
        } else {
            // Hitung nilai akhir
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
            
            // Konversi nilai akhir ke huruf
            String nilaiHuruf;
            String status;
            
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
                status = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
                status = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
                status = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
                status = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
                status = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
                status = "ANDA TIDAK LULUS";
            } else {
                nilaiHuruf = "E";
                status = "ANDA TIDAK LULUS";
            }
            
            // Output hasil
            System.out.printf("Nilai Akhir : %.1f\n", nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("============================");
            System.out.println("============================");
            System.out.println(status);
            System.out.println("============================");
            System.out.println("============================");
        }
        
        scanner.close();
    }
}
