public class BahanMakanan {
    private int roti;
    private int daging;
    private int kentang;
    private int minyak;
    private int soda;

    public BahanMakanan(int roti, int daging, int kentang, int minyak, int soda) {
        this.roti = roti;
        this.daging = daging;
        this.kentang = kentang;
        this.minyak = minyak;
        this.soda = soda;
    }

    public boolean cukupStok(String jenis, int jumlah) {
        switch (jenis) {
            case "roti":
                return roti >= jumlah;
            case "daging":
                return daging >= jumlah;
            case "kentang":
                return kentang >= jumlah;
            case "minyak":
                return minyak >= jumlah;
            case "soda":
                return soda >= jumlah;
            default:
                return false;
        }
    }

    public void kurangiBahan(String jenis, int jumlah) {
        if (cukupStok(jenis, jumlah)) {
            switch (jenis) {
                case "roti":
                    roti -= jumlah;
                    break;
                case "daging":
                    daging -= jumlah;
                    break;
                case "kentang":
                    kentang -= jumlah;
                    break;
                case "minyak":
                    minyak -= jumlah;
                    break;
                case "soda":
                    soda -= jumlah;
                    break;
            }
        } else {
            System.out.println("Stok " + jenis + " tidak cukup.");
        }
    }

    public void tambahBahan(String jenis, int jumlah) {
        switch (jenis) {
            case "roti":
                roti += jumlah;
                break;
            case "daging":
                daging += jumlah;
                break;
            case "kentang":
                kentang += jumlah;
                break;
            case "minyak":
                minyak += jumlah;
                break;
            case "soda":
                soda += jumlah;
                break;
        }
    }

    public void tampilkanBahan() {
        System.out.println("~~~~Bahan Makanan yang tersedia~~~");
        System.out.println("Roti : " + roti);
        System.out.println("Daging : " + daging);
        System.out.println("Kentang : " + kentang);
        System.out.println("Minyak : " + minyak);
        System.out.println("Soda : " + soda);
    }
}
