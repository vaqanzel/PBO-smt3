package Tugas;

public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Total sudut (1 parameter): " + segitiga.totalSudut(45));
        System.out.println("Total sudut (2 parameter): " + segitiga.totalSudut(45, 30));
        System.out.println("Keliling segitiga (3 sisi): " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling segitiga siku-siku (Pythagoras): " + segitiga.keliling(3, 4));
    }
}
