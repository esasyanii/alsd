import java.util.Scanner;

public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();
        Mahasiswa06 m1 = new Mahasiswa06("111", "Ayu", "2c", 3.7);
        Mahasiswa06 m2 = new Mahasiswa06("222", "Dika", "2c", 3.0);
        Mahasiswa06 m3 = new Mahasiswa06("333", "Ila", "2c", 3.8);
        Mahasiswa06 m4 = new Mahasiswa06("444", "Susi", "2c", 3.1);
        Mahasiswa06 m5 = new Mahasiswa06("555", "Yayuk", "2c", 3.4);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
        

        input.close();
    }
}
