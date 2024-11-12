//package Valentina.relasiclass.percobaan2;

public class Penyewaan {
    private Pelanggan pelanggan;

    public Penyewaan() {
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public int hitungTotalBiaya() {
        return pelanggan.hitungBiayaTotal();
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pelanggan: " + pelanggan.getNama());
        System.out.println("Mobil yang disewa: " + pelanggan.getMobil().getMerk());
        System.out.println("Sopir: " + pelanggan.getSopir().getNama());
        System.out.println("Total hari sewa: " + pelanggan.getHari());
        System.out.println("Biaya total: " + hitungTotalBiaya());
    }
}
