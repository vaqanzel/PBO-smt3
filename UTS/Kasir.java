import java.util.ArrayList;

public class Kasir {
    private ArrayList<String> pesanan;
    private double totalPendapatan;

    public Kasir() {
        this.pesanan = new ArrayList<>();
        this.totalPendapatan = 0;
    }

    public void tambahPesanan(String namaMakanan, double harga) {
        pesanan.add(namaMakanan);
        totalPendapatan += harga;
    }

    public void tampilkanPendapatan() {
        System.out.println("=======================");
        System.out.println("Pendapatan hari ini:");
        for (String p : pesanan) {
            System.out.println(p);
        }
        System.out.println("Total Pendapatan: Rp " + totalPendapatan);
    }
}
