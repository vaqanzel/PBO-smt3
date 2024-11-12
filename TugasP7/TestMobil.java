public class TestMobil {
    public static void main(String[] args) {
        // Membuat objek Mobil dengan inisialisasi dari subclass (Polimorfisme)
        Mobil corola = new Sedan(); // Sedan dengan kapasitas 4
        Mobil cary = new Van(); // Van dengan kapasitas 8

        // Menguji method loadingPenumpang pada objek polimorfisme
        System.out.println("Corola (Sedan):");
        corola.loadingPenumpang(3); // Mencoba memuat 3 penumpang
        
        System.out.println("\nCary (Van):");
        cary.loadingPenumpang(9); // Mencoba memuat 9 penumpang
    }
}