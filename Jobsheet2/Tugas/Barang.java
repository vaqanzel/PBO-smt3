public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    public int hitungHargaJual() {
        return (int) (hargaDasar - (diskon / 100 * hargaDasar)); 
    }

    public void tampilData() {
        System.out.println("Kode Barang   : " + kode);
        System.out.println("Nama Barang   : " + namaBarang);
        System.out.println("Harga Dasar   : Rp " + hargaDasar);
        System.out.println("Diskon        : " + diskon + " %");
        System.out.println("Harga Jual    : Rp " + hitungHargaJual());
    }
}
