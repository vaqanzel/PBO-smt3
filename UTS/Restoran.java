import java.util.Map;
import java.util.Random;

public class Restoran {
    private BahanMakanan bahanMakanan;

    public Restoran(BahanMakanan bahanMakanan) {
        this.bahanMakanan = bahanMakanan;
    }

    public void tampilkanBahanMakanan() {
        bahanMakanan.tampilkanBahan();
    }

    public void tambahBahanMakanan(String jenis, int jumlah) {
        bahanMakanan.tambahBahan(jenis, jumlah);
        System.out.println("Bahan " + jenis + " sebanyak " + jumlah + " telah ditambahkan.");
    }

    public void memasak(Makanan makanan) {
        if (makanan.isSudahDimasak()) {
            System.out.println(makanan.getNama() + " sudah dimasak dan tidak dapat dimasak lagi.");
            return; 
        }

        System.out.println("Ingin memasak " + makanan.getNama() + "?");
        boolean dapatMemasak = true;

        for (Map.Entry<String, Integer> entry : makanan.getKomposisi().entrySet()) {
            String jenis = entry.getKey();
            int jumlah = entry.getValue();

            if (!bahanMakanan.cukupStok(jenis, jumlah)) {
                System.out.println("Stok tidak cukup untuk " + jenis);
                dapatMemasak = false;
                break;
            }
        }

        if (dapatMemasak) {
            for (Map.Entry<String, Integer> entry : makanan.getKomposisi().entrySet()) {
                String jenis = entry.getKey();
                int jumlah = entry.getValue();
                bahanMakanan.kurangiBahan(jenis, jumlah);
            }
            System.out.println("Memasak " + makanan.getNama() + "....");

           
            int waktuMemasak = new Random().nextInt(2000) + 1000; 
            try {
                Thread.sleep(waktuMemasak); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(makanan.getNama() + " telah siap!");
            makanan.setSudahDimasak(true); 
        }
    }
}
