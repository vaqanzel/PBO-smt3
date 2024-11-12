public class Pelanggan {
    String nama;
    private String preferensiMakanan;
    private int tingkatKesabaran;
    private int kepuasan;

    public Pelanggan(String nama, String preferensiMakanan, int tingkatKesabaran) {
        this.nama = nama;
        this.preferensiMakanan = preferensiMakanan;
        this.tingkatKesabaran = tingkatKesabaran;
        this.kepuasan = 100; 
    }

    public String getNama() {
        return nama;
    }

    public String getPreferensiMakanan() {
        return preferensiMakanan;
    }

    public int getTingkatKesabaran() {
        return tingkatKesabaran;
    }

    public void setKepuasan(int kepuasan) {
        this.kepuasan = kepuasan;
    }

    public int getKepuasan() {
        return kepuasan;
    }

    public int getKesabaran() {
        throw new UnsupportedOperationException("Unimplemented method 'getKesabaran'");
    }
}
