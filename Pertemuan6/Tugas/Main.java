public class Main {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(5);

        Dosen dosen1 = new Dosen("12345", "Joel Danny", "Jakarta");
        dosen1.setSKS(12); 

        Dosen dosen2 = new Dosen("67890", "Sukarti", "Bandung");
        dosen2.setSKS(8); 

        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);

        daftar.printSemuaGaji();
    }
}
