import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Menu> daftarPesanan = new ArrayList<>();

    public void tambahPesanan(Menu menu) {
        daftarPesanan.add(menu);
        System.out.println(menu.getNama() + " ditambahkan ke pesanan.");
    }

    public double hitungTotal() {
        double total = 0;
        for (Menu m : daftarPesanan) {
            total += m.getHarga();
        }
        return total;
    }

    public void tampilkanPesanan() {
        System.out.println("\nDaftar Pesanan:");
        for (Menu m : daftarPesanan) {
            System.out.println("- " + m);
        }
        System.out.println("Total: Rp " + hitungTotal());
    }
}
