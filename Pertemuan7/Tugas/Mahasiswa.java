package Tugas;

class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan untuk belajar");
    }

    public void tidur() {
        System.out.println("Mahasiswa perlu tidur cukup");
    }
}

