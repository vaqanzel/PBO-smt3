package Tugas;
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getName());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        // Proses peminjaman
        while (true) {
            System.out.print("\nMasukkan jumlah pinjaman: ");
            int jumlahPinjaman = input.nextInt();
            donny.pinjam(jumlahPinjaman);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

            if (donny.getJumlahPinjaman() > 0) {
                // Proses angsuran
                while (donny.getJumlahPinjaman() > 0) {
                    System.out.print("\nMasukkan jumlah angsuran: ");
                    int jumlahAngsuran = input.nextInt();
                    donny.angsur(jumlahAngsuran);
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                }
                System.out.println("\nPinjaman lunas!");
                break;
            } else {
                System.out.println("\nPinjaman lunas!");
                break;
            }
        }

        input.close();
    }
}
