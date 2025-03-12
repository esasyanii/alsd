public class DataDosen06 {
    public static void dataSemuaDosen(Dosen06[] arrayOfDosen) {
        for (Dosen06 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen06[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen06 dosen : arrayOfDosen) {
            if (dosen != null) {
                if (dosen.jenisKelamin) {
                    pria++;
                } else {
                    wanita++;
                }
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen06[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen06 dosen : arrayOfDosen) {
            if (dosen != null) {
                if (dosen.jenisKelamin) {
                    totalUsiaPria += dosen.usia;
                    countPria++;
                } else {
                    totalUsiaWanita += dosen.usia;
                    countWanita++;
                }
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria   : " + (countPria > 0 ? (totalUsiaPria / countPria) : 0));
        System.out.println("Rata-rata Usia Dosen Wanita : " + (countWanita > 0 ? (totalUsiaWanita / countWanita) : 0));
    }

    public static void infoDosenPalingTua(Dosen06[] arrayOfDosen) {
        Dosen06 tertua = arrayOfDosen[0];
        for (Dosen06 dosen : arrayOfDosen) {
            if (dosen != null && dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tertua.cetakInfo();
    }

    public static void infoDosenPalingMuda(Dosen06[] arrayOfDosen) {
        Dosen06 termuda = arrayOfDosen[0];
        for (Dosen06 dosen : arrayOfDosen) {
            if (dosen != null && dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.cetakInfo();
    }
}