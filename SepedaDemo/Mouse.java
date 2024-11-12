public class Mouse extends PerangkatKeras {
    private String tipeSensor;

    public void TipeSensor(String newValue) {
        tipeSensor = newValue;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tipe Sensor: " + tipeSensor);
    }
}