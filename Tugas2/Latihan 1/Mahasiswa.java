public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String cariNama() {
        return nama;
    }

    public String cariNim() {
        return nim;
    }
}
// dosen dapat menilai mahasiswa tertntu
// mahasiswa memilih beberapa matkul
// nilai dari matakuliah