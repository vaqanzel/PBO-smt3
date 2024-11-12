public class Peminjaman {
    int id;
    String namaMember;
    String namaGame;
    double hargaPerHari;
    int lamaSewa;

    public void tampilDataPeminjaman(){
        System.out.println("ID Member     : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Lama Sewa     : " + lamaSewa + " hari");
        System.out.println("Harga Bayar   : Rp " + hitungHargaBayar());  
    }

    public double hitungHargaBayar() {
        return hargaPerHari * lamaSewa;
    }
}
