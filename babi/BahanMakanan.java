public class BahanMakanan {
    private String nama;
    private int jumlah;
    private int stok;

    public BahanMakanan(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getStok() {
        return stok;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void kurangiJumlah(int jumlah) {
        if (this.jumlah >= jumlah) {
            this.jumlah -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi untuk " + nama);
        }
    }
}

  

