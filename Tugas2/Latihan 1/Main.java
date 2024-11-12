public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Budi", "12345");
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Dasar");

        Dosen dosen1 = new Dosen("Pak Surya", "98765");

        dosen1.inputNilai(mhs1, mk1, 85.5);
    }
}
