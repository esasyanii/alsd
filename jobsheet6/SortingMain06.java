public class SortingMain06 {
    public static void main(String[] args) {

        int[] a = {20, 10, 2, 7, 12};
        Sorting06 dataurut1 = new Sorting06(a, a.length);
            
        System.out.println("Data awal 1");
        
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        //jawaban soal no 2b
        int b [] = {30, 20, 2, 8, 14};

        //jawaban soal no 3b
        Sorting06 dataurut2 = new Sorting06(b, b.length);

        //jawaban soal no 4b
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.selectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        //jawaban soal no 2c
        int c[] = {40, 10, 4, 9, 3};

        //jawaban soal 3c
        Sorting06 dataurut3 = new Sorting06(c, c.length);

        //jawaban soal no 4C
        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.selectionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}
