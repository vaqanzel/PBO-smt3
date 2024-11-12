public class Kamar {
    private int nomor;
    private String tipe;
    private String status;
    private Tamu tamu;

    public Kamar(int nomor, String tipe) {
        this.nomor = nomor;
        this.tipe = tipe;
        this.status = "Tersedia"; // Default status
    }

    public int getNomor() {
        return nomor;
    }

    public String getTipe() {
        return tipe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTamu(Tamu tamu) {
        this.tamu = tamu;
        this.status = "Dipesan";
    }

    public String info() {
        String info = "Nomor Kamar: " + nomor + "\nTipe: " + tipe + "\nStatus: " + status;
        if (tamu != null) {
            info += "\nTamu:\n" + tamu.info();
        }
        return info;
    }
}


