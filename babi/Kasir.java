public class Kasir {
    private String nama; 
    private String id;   

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public void prosesPembayaran(Pelanggan pelanggan, double totalHarga) {
        System.out.println("Proses pembayaran untuk " + pelanggan.getNama() + ": " + totalHarga);
 
    }
}
