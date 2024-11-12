public class Main {
    public static void main(String[] args) {
        // Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5);
        System.out.println("PERSEGI PANJANG");
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
        System.out.println();
        System.out.println();

        // Lingkaran
        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("LINGKARAN");
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
        System.out.println();
        System.out.println();

        // Segitiga
        Segitiga segitiga = new Segitiga(6, 8);
        System.out.println("SEGITIGA");
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
        System.out.println();
        System.out.println();
    }
}
