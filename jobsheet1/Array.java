import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========================================");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("========================================");
        System.out.println(" ");

        String[] mataKuliah = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            mataKuliah[i] = scanner.nextLine();
            System.out.print("Masukkan jumlah SKS untuk " + mataKuliah[i] + ": ");
            sks[i] = scanner.nextInt();
            scanner.nextLine(); 
        }
        
        System.out.println("========================================");
        System.out.println("        Program  Untuk IP Semester        ");
        System.out.println("========================================");
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
        }
        
        for (int i = 0; i < jumlahMK; i++) {
            double nilai = nilaiAngka[i];
            if (nilai >= 80) bobotNilai[i] = 4.0;
            else if (nilai >= 73) bobotNilai[i] = 3.5;
            else if (nilai >= 65) bobotNilai[i] = 3.0;
            else if (nilai >= 60) bobotNilai[i] = 2.5;
            else if (nilai >= 50) bobotNilai[i] = 2.0;
            else if (nilai >= 39) bobotNilai[i] = 1.0;
            else bobotNilai[i] = 0.0;
        }
        
        double totalNilai = 0;
        int totalSKS = 0;
        
        System.out.println("\n========================================");
        System.out.println("Hasil Konversi Nilai           ");
        System.out.println("========================================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        for (int i = 0; i < jumlahMK; i++) {
            totalNilai += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
            
            String nilaiHuruf;
            if (nilaiAngka[i] >= 80) nilaiHuruf = "A";
            else if (nilaiAngka[i] >= 73) nilaiHuruf = "B+";
            else if (nilaiAngka[i] >= 65) nilaiHuruf = "B";
            else if (nilaiAngka[i] >= 60) nilaiHuruf = "C+";
            else if (nilaiAngka[i] >= 50) nilaiHuruf = "C";
            else if (nilaiAngka[i] >= 39) nilaiHuruf = "D";
            else nilaiHuruf = "E";
            
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf, bobotNilai[i]);
        }
        
        double ipSemester = totalNilai / totalSKS;
        System.out.println("========================================");
        System.out.printf("IP : %.2f\n", ipSemester);
        System.out.println("========================================");
        
        scanner.close();
    }
}
