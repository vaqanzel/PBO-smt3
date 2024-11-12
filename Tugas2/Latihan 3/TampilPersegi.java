public class TampilPersegi {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        persegi.dataPersegi();

        int luas = persegi.luasPersegi();
        System.out.println("Luas persegi: " + luas);

        int keliling = persegi.kelilingPersegi();
        System.out.println("Keliling persegi: " + keliling);
    }
}