public class MahasiswaBerprestasi06 {
    Mahasiswa06[] listMhs = new Mahasiswa06[5];
    int idx;

    // Metode untuk menambahkan mahasiswa ke dalam list
    void tambah(Mahasiswa06 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa06 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-----------------------------------");
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa06 temp = listMhs[i]; // Simpan elemen saat ini
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) { // Bandingkan IPK
                listMhs[j] = listMhs[j - 1]; // Geser elemen ke kanan
                j--;
            }
            listMhs[j] = temp; // Tempatkan elemen di posisi yang benar
        }
    }
    
}
