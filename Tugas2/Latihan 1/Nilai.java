public class Nilai {
    private Mahasiswa mahasiswa;
    private MataKuliah mataKuliah;
    private double nilai;

    public Nilai(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    public void displayNilai() {
        System.out.println("Nama Mahasiswa: " + mahasiswa.cariNama());
        System.out.println("NIM: " + mahasiswa.cariNim());
        System.out.println("Mata Kuliah: " + mataKuliah.cariNama());
        System.out.println("Nilai: " + nilai);
    }
}
