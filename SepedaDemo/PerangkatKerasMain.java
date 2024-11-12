public class PerangkatKerasMain {
    public static void main(String[] args) {

        // Buat objek untuk setiap perangkat keras
        Charger charger = new Charger();
        CPU cpu = new CPU();
        Monitor monitor = new Monitor();
        Mouse mouse = new Mouse();
        
        // Set atribut dan panggil method untuk setiap objek
        charger.setMerk("Lenovo");
        charger.Tipe("QuickCharge");
        charger.DayaOutput(18);
        charger.cetakInfo();

        System.out.println();

        cpu.setMerk("HP");
        cpu.Tipe("Desktop");
        cpu.TipeProsesor("Core i9");
        cpu.cetakInfo();

        System.out.println();

        monitor.setMerk("Dell");
        monitor.Tipe("LED");
        monitor.UkuranLayar(27);
        monitor.cetakInfo();

        System.out.println();

        mouse.setMerk("Robot");
        mouse.Tipe("Wireless");
        mouse.TipeSensor("Optical");
        mouse.cetakInfo();
    }
}