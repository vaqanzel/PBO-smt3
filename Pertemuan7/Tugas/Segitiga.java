package Tugas;

class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        // Menghitung sudut yang belum diketahui
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        // Menghitung sudut yang belum diketahui dengan dua sudut
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        // Menghitung keliling segitiga dengan tiga sisi
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        // Menghitung keliling segitiga siku-siku dengan rumus Pythagoras
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }
}
