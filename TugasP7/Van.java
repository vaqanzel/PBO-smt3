class Van extends Mobil {

    // Konstruktor
    public Van() {
        super(8); // Kapasitas default untuk Van adalah 8 penumpang
    }

    // Overriding method loadingPenumpang
    @Override
    public void loadingPenumpang(int penumpang) {
        if (penumpang <= kapasitas) {
            System.out.println("Van dapat memuat " + penumpang + " penumpang.");
        } else {
            System.out.println("Van hanya bisa memuat " + kapasitas + " penumpang.");
        }
    }
}