public class SLLMain06 {
    public static void main(String[] args) {
        SingleLinkedList06 sll = new SingleLinkedList06();

        Mahasiswa06 mhs1 = new Mahasiswa06("21212203", "Dirga", "4D", 3.6);
        Mahasiswa06 mhs2 = new Mahasiswa06("22212202", "Cintia", "2C", 3.5);
        Mahasiswa06 mhs3 = new Mahasiswa06("23212201", "Bimon", "2B", 3.8);
        Mahasiswa06 mhs4 = new Mahasiswa06("24212200", "Alvaro", "1A", 4.0);

        sll.addLast(mhs1);         
        sll.insertAt(1, mhs3);     
        sll.insertAt(2, mhs4);     
        sll.addLast(mhs2);         
        System.out.println("data index 1 :");
        Mahasiswa06 data = sll.getData(1);
        if (data != null) data.tampilkanInformasi();

        int index = sll.indexOf("Bimon");
        System.out.println("data mahasiswa an Bimon berada pada index : " + index);
        System.out.println();

        sll.print();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
    }
}
