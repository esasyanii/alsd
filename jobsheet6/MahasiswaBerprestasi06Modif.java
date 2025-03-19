import java.util.ArrayList;

public class MahasiswaBerprestasi06Modif {
    ArrayList<Mahasiswa06Modif> listMhs = new ArrayList<>();

    // Method untuk menambahkan mahasiswa
    public void tambah(Mahasiswa06Modif m) {
        listMhs.add(m);
    }

    // Method untuk menampilkan daftar mahasiswa
    public void tampil() {
        for (Mahasiswa06Modif m : listMhs) {
            m.tampilInformasi();
            System.out.println("---------------------------------------");
        }
    }

    // Method untuk sorting Bubble Sort berdasarkan IPK (Descending)
    public void bubbleSort() {
        int n = listMhs.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listMhs.get(j).ipk < listMhs.get(j + 1).ipk) {
                    Mahasiswa06Modif temp = listMhs.get(j);
                    listMhs.set(j, listMhs.get(j + 1));
                    listMhs.set(j + 1, temp);
                }
            }
        }
    }
}
