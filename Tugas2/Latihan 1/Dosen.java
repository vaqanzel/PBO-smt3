public class Dosen {
    private String nama;
    private String nip;

    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    
    public String cariNama() {
        return nama;
    }

    public String cariNip() {
        return nip;
    }

    public void inputNilai(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilai) {
        Nilai nilaiObj = new Nilai(mahasiswa, mataKuliah, nilai);
        nilaiObj.displayNilai();
    }
}



