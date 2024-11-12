//package Valentina.relasiclass.percobaan2;

public class MainPercobaan2 {
    public static void main(String[] args) {
        // Instansiasi Mobil
        Mobil m = new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(350000);

        // Instansiasi Sopir
        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);

        // Instansiasi Pelanggan
        Pelanggan p = new Pelanggan();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);

        // Instansiasi Penyewaan
        Penyewaan penyewaan = new Penyewaan();
        penyewaan.setPelanggan(p);

        // Tampilkan info penyewaan
        penyewaan.tampilkanInfo();

        System.out.println(p.getMobil().getMerk());
    }
}
