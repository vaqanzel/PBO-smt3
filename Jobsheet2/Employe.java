public class Employe {
    private String nama;

    public Employe(String nama, int id) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public static void main(String[] args) {

        Employe Jono = new Employe("Jono", 112);
        Employe Jojon = new Employe("Jojon", 111);

        Jojon = Jono;

        Jono.setNama("Jono");

        System.out.println(Jojon.getNama());
    }
}
