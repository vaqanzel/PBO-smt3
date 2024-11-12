public class Charger extends PerangkatKeras {
    private int dayaOutput;

    public void DayaOutput(int newValue) {
        dayaOutput = newValue;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Daya Output: " + dayaOutput + "W");
    }
}