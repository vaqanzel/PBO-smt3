import java.util.ArrayList;
import java.util.Scanner;

public class Restoran {
    ArrayList<Makanan> menu;
    ArrayList<Pelanggan> pelangganList;
    private double totalPendapatan;
    private ArrayList<String> makananTerjual; 

    public Restoran(ArrayList<Makanan> menu) {
        this.menu = menu;
        this.pelangganList = new ArrayList<>();
        this.totalPendapatan = 0;
        this.makananTerjual = new ArrayList<>();
    }

    public void tampilkanMenu() {
        System.out.println("\n=======================================");
        System.out.println("             ~~~ Menu ~~~               ");
        System.out.println("\n");
        int index = 1;
        for (Makanan makanan : menu) {
            System.out.println(index + ". Nama Makanan: " + makanan.getNama());
            System.out.println("   Harga: " + makanan.getHarga());
            System.out.println("   Bahan:");
            for (BahanMakanan bahan : makanan.getBahanMakanan()) {
                System.out.println("      - Bahan: " + bahan.getNama() + ", Stok: " + bahan.getJumlah());
            }
            System.out.println("   Waktu Memasak: " + makanan.getWaktuMemasak() + " detik");
            index++;
        }
    }

    public void tampilkanStok() {
        System.out.println("\n=======================================");
        System.out.println("      ~~ Stok Bahan Makanan ~~");
        System.out.println("\n");
        for (Makanan makanan : menu) {
            makanan.tampilkanBahan();
        }
    }

    public void tambahkanPelanggan(Pelanggan pelanggan) {
        pelangganList.add(pelanggan);
        System.out.println("Pelanggan " + pelanggan.getNama() + " datang dengan preferensi " + pelanggan.getPreferensiMakanan());
    }

    public void prosesPesanan(Pelanggan pelanggan, int pilihanMakanan) {
        Makanan makanan = menu.get(pilihanMakanan - 1); 
        boolean stokCukup = true;
        for (BahanMakanan bahan : makanan.getBahanMakanan()) {
            if (bahan.getJumlah() <= 0) {
                stokCukup = false;
                System.out.println("Stok " + bahan.getNama() + " habis, tidak bisa memproses pesanan.");
            }
        }

        if (stokCukup) {
            makanan.kurangiStok(); 
            System.out.println(makanan.getNama() + " sedang disiapkan...");
            try {
                Thread.sleep(makanan.getWaktuMemasak() * 1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(makanan.getNama() + " telah siap untuk disajikan!");
            totalPendapatan += makanan.getHarga();
            makananTerjual.add(makanan.getNama()); 
            System.out.println("Total Pendapatan: " + totalPendapatan);

            int kepuasan = 100 - (pelanggan.getTingkatKesabaran() * makanan.getWaktuMemasak());
            System.out.println(pelanggan.getNama() + " memiliki tingkat kepuasan: " + kepuasan + "/100");
        }
    }

    public void tambahMenu(Makanan makanan) {
        menu.add(makanan);
    }

    public double getTotalPendapatan() {
        return totalPendapatan;
    }

    public void tambahStokBahan(int indexBahan, int jumlahTambahan) {
        for (Makanan makanan : menu) {
            if (indexBahan >= 0 && indexBahan < makanan.getBahanMakanan().size()) {
                BahanMakanan bahan = makanan.getBahanMakanan().get(indexBahan);
                bahan.setJumlah(bahan.getJumlah() + jumlahTambahan);
                System.out.println("Stok " + bahan.getNama() + " berhasil ditambahkan menjadi " + bahan.getJumlah());
                return;
            }
        }
        System.out.println("Bahan tidak ditemukan.");
    }

    
    public void tampilkanMakananTerjual() {
        if (makananTerjual.isEmpty()) {
            System.out.println("Belum ada makanan yang terjual.");
        } else {
            System.out.println("\n=======================================");
            System.out.println("         ~~ Makanan Terjual ~~            ");
            for (String makanan : makananTerjual) {
                System.out.println(makanan);
            }
        }
    }
}
