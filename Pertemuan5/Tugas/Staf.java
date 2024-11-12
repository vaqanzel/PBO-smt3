public class Staf {
    private String idStaf;
    private String nama;

    public Staf(String idStaf, String nama) {
        this.idStaf = idStaf;
        this.nama = nama;
    }

    public String getIdStaf() {
        return idStaf;
    }

    public void setIdStaf(String idStaf) {
        this.idStaf = idStaf;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String info() {
        return "ID Staf: " + idStaf + "\nNama: " + nama;
    }
}
