public class SepedaMain
{
    public static void main(String[] args) {
        {
            // Buat dua buah objek sepeda
            Sepeda spd1 = new Sepeda ();
            Sepeda spd2 = new Sepeda ();
            SepedaGunung spd3 = new SepedaGunung();
            
            // Panggil method didalam objek sepeda
            spd1.setMerek("Polygone");
            spd1.tambahKecepatan(10);
            spd1.gantiGear(2);
            spd1.CetakStatus();

            spd2.setMerek("Wiim Cycle");
            spd2.tambahKecepatan(10);
            spd2.gantiGear(2);
            spd2.tambahKecepatan(10);
            spd2.gantiGear(3);
            spd2.CetakStatus();

            spd3.setMerek("Klinee");
            spd3.tambahKecepatan(5);
            spd3.gantiGear(7);
            spd3.ssetTipeSuspensi("Gas suspension");
            spd3.cetakStatus();
        }
        
    }
}
