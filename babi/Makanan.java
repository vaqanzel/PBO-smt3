import java.util.ArrayList;

public class Makanan {
    private String nama;
    private double harga;
    private int waktuMemasak; 
    private ArrayList<BahanMakanan> bahanMakanan;

    public Makanan(String nama, double harga, int waktuMemasak, ArrayList<BahanMakanan> bahanMakanan) {
        this.nama = nama;
        this.harga = harga;
        this.waktuMemasak = waktuMemasak;
        this.bahanMakanan = bahanMakanan;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getWaktuMemasak() {
        return waktuMemasak;
    }

    public void kurangiStok() {
        for (BahanMakanan bahan : bahanMakanan) {
            bahan.kurangiJumlah(1); 
        }
    }

    public void tampilkanBahan() {
        for (BahanMakanan bahan : bahanMakanan) {
            System.out.println("Bahan: " + bahan.getNama() + ", Stok: " + bahan.getJumlah());
        }
    }

    public ArrayList<BahanMakanan> getBahanMakanan() {
        return bahanMakanan;
    }

    public void tambahStokBahan(int jumlahTambahan) {
        throw new UnsupportedOperationException("Unimplemented method 'tambahStokBahan'");
    }
}
