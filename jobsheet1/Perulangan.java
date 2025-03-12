import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input NIM dari pengguna
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();
        
        // Mengambil dua digit terakhir dari NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        
        // Jika n < 10 maka tambahkan 10
        if (n < 10) {
            n += 10;
        }
        
        System.out.println("============================");
        System.out.println("n : " + n);
        
        // Cetak deretan bilangan sesuai aturan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // Lewati angka 6 dan 10
            }
            if (i % 2 == 0) {
                System.out.print(i + " "); // Cetak angka genap
            } else {
                System.out.print("* "); // Cetak angka ganjil sebagai '*'
            }
        }
        
        scanner.close();
    }
}


