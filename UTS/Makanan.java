import java.util.HashMap;
import java.util.Map;

public class Makanan {
    private String nama;
    private double harga;
    private boolean sudahDimasak; 
    private Map<String, Integer> komposisi;

    public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
        this.sudahDimasak = false; 
        this.komposisi = new HashMap<>();
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isSudahDimasak() {
        return sudahDimasak;
    }

    public void setSudahDimasak(boolean sudahDimasak) {
        this.sudahDimasak = sudahDimasak;
    }

    public void tambahKomposisi(String jenis, int jumlah) {
        komposisi.put(jenis, jumlah);
    }

    public Map<String, Integer> getKomposisi() {
        return komposisi;
    }
}
