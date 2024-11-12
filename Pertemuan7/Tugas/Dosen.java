package Tugas;

class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan untuk tenaga mengajar");
    }

    public void lembur() {
        System.out.println("Dosen sering lembur mengoreksi tugas");
    }
}