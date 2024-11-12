class Mobil {
    protected int kapasitas;

    public Mobil(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void loadingPenumpang(int penumpang) {
        if (penumpang <= kapasitas) {
            System.out.println("Mobil dapat memuat " + penumpang + " penumpang.");
        } else {
            System.out.println("Kapasitas tidak mencukupi! Hanya bisa memuat " + kapasitas + " penumpang.");
        }
    }
}