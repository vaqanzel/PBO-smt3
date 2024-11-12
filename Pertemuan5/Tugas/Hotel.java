public class Hotel {
    private String nama;
    private Kamar[] listKamar;

    public Hotel(String nama, int jumlahKamar) {
        this.nama = nama;
        this.listKamar = new Kamar[jumlahKamar];
        initKamar();
    }

    private void initKamar() {
        for (int i = 0; i < listKamar.length; i++) {
            this.listKamar[i] = new Kamar(i + 1, "Standar");
        }
    }

    public void addKamar(Kamar kamar, int nomor) {
        this.listKamar[nomor - 1] = kamar;
    }

    public void setTamu(Tamu tamu, int nomorKamar) {
        if (this.listKamar[nomorKamar - 1].getStatus().equals("Tersedia")) {
            this.listKamar[nomorKamar - 1].setTamu(tamu);
        } else {
            System.out.println("Kamar nomor " + nomorKamar + " sudah dipesan!");
        }
    }

    public String info() {
        String info = "Hotel: " + nama + "\n";
        for (Kamar kamar : listKamar) {
            info += kamar.info() + "\n";
        }
        return info;
    }
}
