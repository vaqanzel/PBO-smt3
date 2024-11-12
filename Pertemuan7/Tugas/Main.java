package Tugas;

public class Main {
    public static void main(String[] args) {
        Manusia m1 = new Manusia();
        Manusia m2 = new Dosen();
        Manusia m3 = new Mahasiswa();

        m1.makan();
        m2.makan();
        m3.makan();

        // dynamic method dispatch
        m2.bernafas();
        m3.bernafas();
    }
}
