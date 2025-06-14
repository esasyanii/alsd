public class Mahasiswa06 {
   String nim;
   String nama;
   String kelas;
   double ipk;
   
    public Mahasiswa06() {}

    public Mahasiswa06(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
    }
}
