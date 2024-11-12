public class Monitor extends PerangkatKeras {
    private int ukuranLayar;

    public void UkuranLayar(int newValue) {
        ukuranLayar = newValue;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
    }
}
