public class AntrianPasien06 {
    Pasien06 head;
    Pasien06 tail;
    int size;

    public void tambahPasien(Pasien06 pasien) {
        if (head == null) {
            head = tail = pasien;
        } else {
            tail.next = pasien;
            tail = pasien;
        }
        size++;
    }

    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        Pasien06 current = head;
        while (current != null) {
            current.tampilkanInformasi();
            System.out.println();
            current = current.next;
        }
    }

    public Pasien06 layaniPasien() {
        if (head == null) return null;

        Pasien06 pasien = head;
        head = head.next;
        size--;
        if (head == null) tail = null;
        return pasien;
    }

    public int sisaAntrian() {
        return size;
    }

    public void cariPasien(String namaCari) {
        Pasien06 current = head;
        boolean ditemukan = false;

        while (current != null) {
            if (current.nama.equalsIgnoreCase(namaCari)) {
                System.out.println(">> Pasien ditemukan:");
                current.tampilkanInformasi();
                ditemukan = true;
                break; // hentikan kalau sudah ketemu (atau hilangkan break kalau mau semua yg sama nama ditampilkan)
            }
            current = current.next;
        }

        if (!ditemukan) {
            System.out.println(">> Pasien dengan nama \"" + namaCari + "\" tidak ditemukan dalam antrian.");
        }
    }
}
