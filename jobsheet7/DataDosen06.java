import java.util.ArrayList;

public class DataDosen06 {
    Dosen06[] dataDosen = new Dosen06[10];
    int idx = 0;

    // Menambahkan data dosen ke dalam array
    public void tambah(Dosen06 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // Menampilkan semua data dosen
    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    // Metode Pencarian Data Sequential (berdasarkan nama)
    public ArrayList<Dosen06> PencarianDataSequential06(String nama) {
        ArrayList<Dosen06> hasilPencarian = new ArrayList<>();
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) { // Bandingkan nama
                hasilPencarian.add(dataDosen[i]);
            }
        }

        // Deteksi jika ditemukan lebih dari satu hasil
        if (hasilPencarian.size() > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu hasil pencarian!");
        }

        return hasilPencarian;
    }

    // Sorting ASC berdasarkan usia untuk persiapan Binary Search
    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia < dataDosen[minIndex].usia) {
                    minIndex = j;
                }
            }
            Dosen06 temp = dataDosen[minIndex];
            dataDosen[minIndex] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    // Metode Pencarian Data Binary (berdasarkan usia)
    public int PencarianDataBinary06(int usia, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // Jika ditemukan
            if (dataDosen[mid].usia == usia) {
                return mid;
            }

            // Jika usia lebih kecil, cari di sebelah kiri
            if (dataDosen[mid].usia > usia) {
                return PencarianDataBinary06(usia, left, mid - 1);
            }

            // Jika usia lebih besar, cari di sebelah kanan
            return PencarianDataBinary06(usia, mid + 1, right);
        }

        // Jika tidak ditemukan
        return -1;
    }
}
