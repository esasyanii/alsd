import java.util.Scanner;
public class MahasiswaDemo06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Mahasiswa06[] arrayOfMahasiswa06 = new Mahasiswa06[3];
        String dummy;
        
        for(int i=0; i < 3; i++){
            arrayOfMahasiswa06[i] = new Mahasiswa06();

            System.out.println("Masukkan Data Mahasiswa ke-" + (1+i));
            System.out.print("NIM      : ");
            arrayOfMahasiswa06[i].nim = sc.nextLine();
            System.out.print("Nama     : ");
            arrayOfMahasiswa06[i].nama = sc.nextLine();
            System.out.print("Kelas    : ");
            arrayOfMahasiswa06[i].kelas = sc.nextLine();
            System.out.print("IPK      : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa06[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
        }
        
        
        arrayOfMahasiswa06[1] = new Mahasiswa06();
        arrayOfMahasiswa06[1].nim = "2341720172";
        arrayOfMahasiswa06[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa06[1].kelas = "TI-2A";
        arrayOfMahasiswa06[1].ipk = (float) 3.36;

        arrayOfMahasiswa06[2] = new Mahasiswa06();
        arrayOfMahasiswa06[2].nim = "244107023006";
        arrayOfMahasiswa06[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa06[2].kelas = "TI-2E";
        arrayOfMahasiswa06[2].ipk = (float) 3.80;

        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa06[i].cetakInfo();
        }

        sc.close();
        
    }
}


