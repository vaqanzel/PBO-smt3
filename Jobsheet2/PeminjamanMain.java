public class PeminjamanMain {
    public static void main(String[] args) {
       
        Peminjaman pinjam1 = new Peminjaman();
        pinjam1.id = 1;
        pinjam1.namaMember = "Yoel";
        pinjam1.namaGame = "PUBG";
        pinjam1.hargaPerHari = 15000;
        pinjam1.lamaSewa = 3;
        pinjam1.tampilDataPeminjaman();
    }
}
