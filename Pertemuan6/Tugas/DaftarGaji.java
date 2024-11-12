public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int index;

    public DaftarGaji(int size) {
        listPegawai = new Pegawai[size];
        index = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (index < listPegawai.length) {
            listPegawai[index] = pegawai;
            index++;
        } else {
            System.out.println("Daftar Gaji penuh!");
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < index; i++) {
            System.out.println("Nama: " + listPegawai[i].getNama() + ", Gaji: " + listPegawai[i].getGaji());
        }
    }
}
