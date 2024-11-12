class Sedan extends Mobil {

    // Konstruktor
    public Sedan() {
        super(4); // Kapasitas default untuk Sedan adalah 4 penumpang
    }

    // Overriding method loadingPenumpang
    @Override
    public void loadingPenumpang(int penumpang) {
        if (penumpang <= kapasitas) {
            System.out.println("Sedan dapat memuat " + penumpang + " penumpang.");
        } else {
            System.out.println("Sedan hanya bisa memuat " + kapasitas + " penumpang.");
        }
    }
}