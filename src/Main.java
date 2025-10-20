
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Aplikasi Pemesanan Restoran ===");

        Menu menu1 = new Menu("Nasi Goreng Spesial", 20000);
        Menu menu2 = new Menu("Ayam Bakar Madu", 25000);
        Menu menu3 = new Menu("Es Teh Manis", 5000);
        Menu menu4 = new Menu("Es Jeruk", 5000) ;
        Menu menu5 = new Menu ("ES Anget", 5000) ;
        Order pesanan = new Order();
        pesanan.tambahPesanan(menu1);
        pesanan.tambahPesanan(menu3);

        pesanan.tampilkanPesanan();
    }
}
