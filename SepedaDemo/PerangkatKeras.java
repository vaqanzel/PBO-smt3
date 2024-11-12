public class PerangkatKeras {
    private String merk;
    private String tipe;

    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void Tipe(String newValue) {
        tipe = newValue;
    }

    public void cetakInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
    }
}