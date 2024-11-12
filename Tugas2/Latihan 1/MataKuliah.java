public class MataKuliah {
    private String kode;
    private String nama;

    public MataKuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String cariKode() {
        return kode;
    }

    public String cariNama() {
        return nama;
    }
}