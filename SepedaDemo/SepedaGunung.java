public class SepedaGunung extends Sepeda
{
    private String tipeSuspensi;

    public void ssetTipeSuspensi (String newValue)
    {
        tipeSuspensi = newValue;
    }

    public void cetakStatus()
    {
        super.CetakStatus();
        System.out.println("Tipe suspensi: " + tipeSuspensi);
    }
}
