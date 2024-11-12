package Tugas;

public class Anggota {
    private String ktp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String ktp, String nama, int limitPinjaman) {
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getName() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        if (jumlahPinjaman + jumlah > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(int jumlah) {
        if (jumlah > 0) {
            // Minimal angsuran adalah 10% dari jumlah pinjaman saat ini
            int minimalAngsuran = jumlahPinjaman / 10;
            if (jumlah < minimalAngsuran) {
                System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman.");
            } else {
                jumlahPinjaman -= jumlah;
                if (jumlahPinjaman < 0) {
                    jumlahPinjaman = 0;
                }
            }
        }
    }
}
