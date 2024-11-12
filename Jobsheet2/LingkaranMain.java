import java.util.Scanner;
public class LingkaranMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Lingkaran lingkaran1 = new Lingkaran();

        System.out.print("Masukkan jari-jari lingkaran: ");
        lingkaran1.r = input.nextDouble(); 
        System.out.println("Luas Lingkaran     : " + lingkaran1.hitungLuas());
        System.out.println("Keliling Lingkaran : "+lingkaran1.hitungKeliling());
    }
}
