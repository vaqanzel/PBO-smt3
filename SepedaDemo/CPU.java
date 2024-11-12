public class CPU extends PerangkatKeras {
    private String tipeProsesor;

    public void TipeProsesor(String newValue) {
        tipeProsesor = newValue;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tipe Prosesor: " + tipeProsesor);
    }
}