import java.util.ArrayList;
import java.util.Collections;

public class Sorting06 {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);
        
        System.out.println(daftarSiswa);

        ArrayList<Customer06> customers = new ArrayList<>();
        customers.add(new Customer06(2, "Zara"));
        customers.add(new Customer06(1, "Andi"));
        customers.add(new Customer06(3, "Rudi"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}
