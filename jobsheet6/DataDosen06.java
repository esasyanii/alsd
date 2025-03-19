public class DataDosen06 {
    Dosen06[] dataDosen = new Dosen06[10];
    int idx = 0;

    // Method untuk menambahkan dosen ke dalam array
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

    // Sorting Ascending berdasarkan usia (Selection Sort)
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
        System.out.println("\nData setelah diurutkan secara ASC (Usia):");
        tampil(); // Langsung menampilkan hasil setelah sorting
    }

    // Sorting Descending berdasarkan usia (Insertion Sort)
    public void sortingDSC() {
        for (int i = 1; i < idx; i++) {
            Dosen06 key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = key;
        }
        System.out.println("\nData setelah diurutkan secara DSC (Usia):");
        tampil(); // Langsung menampilkan hasil setelah sorting
    }
}
