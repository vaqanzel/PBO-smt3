import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Makanan> menu = new ArrayList<>();

        // Menu Burger
        ArrayList<BahanMakanan> bahanBurger = new ArrayList<>();
        bahanBurger.add(new BahanMakanan("Daging", 10));
        bahanBurger.add(new BahanMakanan("Roti", 20));
        bahanBurger.add(new BahanMakanan("Selada", 15));
        menu.add(new Makanan("Burger", 25000, 5, bahanBurger));

        // Menu Kentang Goreng
        ArrayList<BahanMakanan> bahanKentangGoreng = new ArrayList<>();
        bahanKentangGoreng.add(new BahanMakanan("Kentang", 15));
        menu.add(new Makanan("Kentang Goreng", 15000, 3, bahanKentangGoreng));

        // Menu Soda
        ArrayList<BahanMakanan> bahanSoda = new ArrayList<>();
        bahanSoda.add(new BahanMakanan("Soda", 50));
        menu.add(new Makanan("Soda", 10000, 1, bahanSoda));

        // Menu Ayam Goreng
        ArrayList<BahanMakanan> bahanAyam = new ArrayList<>();
        bahanAyam.add(new BahanMakanan("Ayam", 20));
        menu.add(new Makanan("Ayam Goreng", 30000, 7, bahanAyam));

        Restoran restoran = new Restoran(menu);
        Kasir kasir = new Kasir(); 

        int pilihan = -1;
        while (pilihan != 0) {
            System.out.println("\n=======================================");
            System.out.println(" SELAMAT DATANG DI RESTORAN CEPAT SAJI ");
            System.out.println("=======================================");
            System.out.println("1. Tampilkan Menu");
            System.out.println("2. Tampilkan Stok Bahan Makanan");
            System.out.println("3. Tambah Pelanggan");
            System.out.println("4. Proses Pesanan");
            System.out.println("5. Tambah Stok Bahan Makanan");
            System.out.println("6. Kasir - Proses Pembayaran");
            System.out.println("7. Cek Antrian Pelanggan");
            System.out.println("8. Lihat Pendapatan Restoran");
            System.out.println("9. Lihat Makanan yang Sudah Terjual");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    restoran.tampilkanMenu();
                    break;
                case 2:
                    restoran.tampilkanStok();
                    break;
                case 3:
                    System.out.println("\n=======================================");
                    System.out.print("Masukkan nama pelanggan: ");
                    scanner.nextLine(); 
                    String namaPelanggan = scanner.nextLine();
                    System.out.print("Masukkan preferensi makanan (nomor): ");
                    int preferensiMakanan = scanner.nextInt();
                    System.out.print("Masukkan tingkat kesabaran (1-10): ");
                    int tingkatKesabaran = scanner.nextInt();
                    Pelanggan pelanggan = new Pelanggan(namaPelanggan, preferensiMakanan + "", tingkatKesabaran);
                    restoran.tambahkanPelanggan(pelanggan);
                    break;
                case 4:
                    System.out.print("Pilih nomor pelanggan: ");
                    int nomorPelanggan = scanner.nextInt();

                    if (nomorPelanggan <= restoran.pelangganList.size() && nomorPelanggan > 0) {
                        System.out.print("Pilih nomor makanan: ");
                        int nomorMakanan = scanner.nextInt();
                        Pelanggan pelangganDipilih = restoran.pelangganList.get(nomorPelanggan - 1);
                        restoran.prosesPesanan(pelangganDipilih, nomorMakanan);

                        restoran.pelangganList.remove(nomorPelanggan - 1);
                        System.out.println("Pelanggan telah diproses dan dihapus dari antrian.");
                    } else {
                        System.out.println("Maaf, pelanggan dengan kode " + nomorPelanggan + " tidak ada di antrian.");
                    }
                    break;
                case 5:
                    System.out.println("--- Tambah Stok Bahan Makanan ---");
                    restoran.tampilkanStok(); 
                    System.out.print("Pilih nomor bahan yang ingin ditambah: ");
                    int nomorBahan = scanner.nextInt();
                    System.out.print("Masukkan jumlah stok tambahan: ");
                    int jumlahTambahan = scanner.nextInt();
                    restoran.tambahStokBahan(nomorBahan - 1, jumlahTambahan);
                    break;
                case 6:
                    System.out.print("Masukkan nomor pelanggan untuk pembayaran: ");
                    int nomorPembayaran = scanner.nextInt();

                    if (nomorPembayaran <= restoran.pelangganList.size() && nomorPembayaran > 0) {
                        Pelanggan pelangganBayar = restoran.pelangganList.get(nomorPembayaran - 1);
                        System.out.print("Pilih nomor makanan yang dipesan: ");
                        int nomorMakananBayar = scanner.nextInt();

                        kasir.prosesPembayaran(pelangganBayar, restoran.menu.get(nomorMakananBayar - 1).getHarga());
                    } else {
                        System.out.println("Maaf, pelanggan dengan kode " + nomorPembayaran + " tidak ada di antrian.");
                    }
                    break;
                case 7:
                    if (restoran.pelangganList.size() > 0) {
                        System.out.println("--- Daftar Antrian Pelanggan ---");
                        for (int i = 0; i < restoran.pelangganList.size(); i++) {
                            System.out.println("Nomor Antrian: " + (i + 1) + ", Nama: " + restoran.pelangganList.get(i).getNama());
                        }
                    } else {
                        System.out.println("Tidak ada pelanggan dalam antrian.");
                    }
                    break;
                case 8:
                    System.out.println("Total Pendapatan Hari Ini: " + restoran.getTotalPendapatan());
                    break;
                case 9:
                    restoran.tampilkanMakananTerjual();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan simulasi restoran.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
                    break;
            }
        }

        scanner.close();
    }
}
