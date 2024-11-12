import java.util.*;

public class Main {
    static Queue<String> antrianPelanggan = new LinkedList<>();
    static Map<String, Integer> stokBahan = new HashMap<>();
    static int pendapatan = 0;
    static List<String> daftarPenjualan = new ArrayList<>();
    static String pesananTerakhir = "";
    static int waktuMemasak = 3; 
    private static Queue<String> daftarPesanan = new LinkedList<>();
    private static Map<String, Boolean> statusPesanan = new HashMap<>(); 


    
    public static void main(String[] args) {
        Map<String, Integer> hargaPesanan = new HashMap<>();
        hargaPesanan.put("Burger", 25000);
        hargaPesanan.put("Kentang Goreng", 15000);
        hargaPesanan.put("Minuman", 8000);

        stokBahan.put("Roti", 5);
        stokBahan.put("Daging", 10);
        stokBahan.put("Kentang", 20);
        stokBahan.put("Minyak", 2);
        stokBahan.put("Soda", 7);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;

        while (running) {
            System.out.println("\nPilih opsi:");
            System.out.println("1. Menunggu pelanggan");
            System.out.println("2. Cek antrian");
            System.out.println("3. Memesan");
            System.out.println("4. Memasak");
            System.out.println("5. Pembayaran");
            System.out.println("6. Cek Pendapatan hari ini");
            System.out.println("7. Keluar");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    if (random.nextBoolean()) {
                        String pelanggan = "Pelanggan " + (antrianPelanggan.size() + 1);
                        antrianPelanggan.add(pelanggan);
                        System.out.println(pelanggan + " datang.");
                    } else {
                        System.out.println("Tidak ada pelanggan yang datang.");
                    }
                    break;
                case 2:
                    if (antrianPelanggan.isEmpty()) {
                        System.out.println("\n=====================");
                        System.out.println("      ~~~Antrian~~~");
                        System.out.println("      Tidak ada antrian.\n=====================");
                    } else {
                        System.out.println("\n=====================");
                        System.out.println("      ~~~Antrian~~~");
                        int no = 1;
                        for (String pelanggan : antrianPelanggan) {
                            System.out.println("      " + no + ". " + pelanggan);
                            no++;
                        }
                        System.out.println("=====================");
                    }
                    break;
                case 3:
                    if (!antrianPelanggan.isEmpty()) {
                        String pelanggan = antrianPelanggan.poll();
                        System.out.println("\n========================");
                        System.out.println("      ~~~Pemesanan~~~");
                        System.out.println(pelanggan + " ingin memesan ?");
                        System.out.println("Menu:");
                        System.out.println("1. Burger - Rp 25000");
                        System.out.println("2. Kentang Goreng - Rp 15000");
                        System.out.println("3. Minuman - Rp 8000");
                        System.out.println("========================");
                        int pesanan = scanner.nextInt();
                        switch (pesanan) {
                            case 1:
                                System.out.println(pelanggan + " memesan Burger dengan harga Rp 25000.0");
                                pesananTerakhir = "Burger";
                                pendapatan += 25000;
                                daftarPenjualan.add("Burger");
                                statusPesanan.put("Burger", false); 
                                break;
                            case 2:
                                System.out.println(pelanggan + " memesan Kentang Goreng dengan harga Rp 15000.0");
                                pesananTerakhir = "Kentang Goreng";
                                pendapatan += 15000;
                                daftarPenjualan.add("Kentang Goreng");
                                statusPesanan.put("Kentang Goreng", false); 
                                break;
                            case 3:
                                System.out.println(pelanggan + " memesan Minuman dengan harga Rp 8000.0");
                                pesananTerakhir = "Minuman";
                                pendapatan += 8000;
                                daftarPenjualan.add("Minuman");
                                statusPesanan.put("Minuman", false); 
                                break;
                        }
                        System.out.println("\nPesanan pelanggan telah diterima, memasak segera dimulai.");
                    } else {
                        System.out.println("Tidak ada pelanggan di antrian.");
                    }
                    break;
                case 4:
                    System.out.println("\n====================================");
                    System.out.println("   ~~~Dapur Restoran cepat saji~~~");
                    boolean dalamMenuMemasak = true;
                    while (dalamMenuMemasak) {
                        if (!pesananTerakhir.equals("")) {
                            if (statusPesanan.get(pesananTerakhir)) {
                                System.out.println(pesananTerakhir + " telah dimasak sebelumnya.");
                                dalamMenuMemasak = false; 
                                break;
                            }
                            System.out.println("1. Pelanggan memesan " + pesananTerakhir);
                            System.out.println("\nOpsi :");
                            System.out.println("1. Memasak");
                            System.out.println("2. Cek bahan makanan");
                            System.out.println("3. Tambah bahan makanan");
                            System.out.println("4. Kembali ke menu utama");

                            int opsiDapur = scanner.nextInt();
                            switch (opsiDapur) {
                                case 1:
                                    // Memasak pesanan
                                    memasakMakanan(scanner, random);
                                    statusPesanan.put(pesananTerakhir, true); 
                                    break;
                                case 2:
                                    // Cek stok bahan makanan
                                    cekStokBahan();
                                    break;
                                case 3:
                                    // Tambah stok bahan makanan
                                    tambahStokBahan(scanner);
                                    break;
                                case 4:
                                    System.out.println("Kembali ke menu utama...");
                                    dalamMenuMemasak = false;
                                    break;
                                default:
                                    System.out.println("Pilihan tidak valid.");
                            }
                        } else {
                            System.out.println("OPS.. belum ada pelanggan yang memesan");
                            dalamMenuMemasak = false; 
                        }
                    }
                    break;

                    case 5:
                    if (!daftarPenjualan.isEmpty()) {
                        System.out.println("~~~~~~Kasir restoran cepat saji~~~~~~");
                        
                        String pesanan = daftarPenjualan.get(0); 
                        double harga = 0.0;
                        
                        if (pesanan.equals("Burger")) {
                            harga = 25000.0;
                        } else if (pesanan.equals("Kentang Goreng")) {
                            harga = 15000.0; 
                        } else if (pesanan.equals("Minuman")) {
                            harga = 10000.0;
                        }
                        
                        System.out.println("Pelanggan 1 memesan " + pesanan + " dengan harga Rp " + harga); 
                        
                        boolean pembayaranLunas = false;
                        double totalPembayaran = harga;
                        double pembayaran = 0.0;
                        
                        while (!pembayaranLunas) {
                            System.out.print("Masukkan jumlah pembayaran: ");
                            double bayar = scanner.nextDouble();
                            pembayaran += bayar;
                            
                            if (pembayaran < totalPembayaran) {
                                System.out.println("Pembayaran kurang Rp " + (totalPembayaran - pembayaran));
                            } else {
                                double kembalian = pembayaran - totalPembayaran;
                                System.out.println("Anda mendapat kembalian Rp " + kembalian);
                                System.out.println("Pembayaran untuk pelanggan 1 lunas.");
                                pembayaranLunas = true;
                            }
                        }
                        
                        System.out.println("\n~~~~Kepuasan Pelanggan~~~~");
                        System.out.print("Seberapa puas anda dengan pesanan ini 1/10? ");
                        int tingkatKepuasan = scanner.nextInt();

                        double kepuasan = (double) tingkatKepuasan / waktuMemasak; 
                        System.out.println("Terima kasih pelanggan 1 atas pesanannya, tingkat kepuasan anda adalah: " + kepuasan);
                    } else {
                         System.out.println("Tidak ada pesanan untuk dibayar.");
                        }
                         break;

                    case 6:
                    if (!daftarPenjualan.isEmpty()) {
                        System.out.println("\n=======================");
                        System.out.println("Pendapatan hari ini:");
                        Map<String, Integer> jumlahPesanan = new HashMap<>();

                        for (String item : daftarPenjualan) {
                            jumlahPesanan.put(item, jumlahPesanan.getOrDefault(item, 0) + 1);
                        }

                        for (Map.Entry<String, Integer> entry : jumlahPesanan.entrySet()) {
                            String item = entry.getKey(); 
                            int jumlah = entry.getValue(); 
                            int hargaItem = hargaPesanan.get(item); 
                            int totalItemPendapatan = jumlah * hargaItem; 
                            System.out.println(item + " terjual: " + jumlah + " pcs, Total pendapatan: Rp " + totalItemPendapatan);
                        }
                        System.out.println("=======================");
                    } else {
                        System.out.println("Belum ada penjualan hari ini.");
                    }
                    break;

                case 7:
                    System.out.println("Terima kasih telah menggunakan permainan restoran cepat saji.");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }

    private static void memasakMakanan(Scanner scanner, Random random) {
        System.out.println("\nIngin memasak?");
        
        if (pesananTerakhir.equals("Burger")) {
            System.out.println("1. Ambil roti");
            System.out.println("2. Ambil daging");
            int pilihBahan = scanner.nextInt();
    
            if (pilihBahan == 1 && stokBahan.get("Roti") > 0) {
                stokBahan.put("Roti", stokBahan.get("Roti") - 1);
                System.out.println("Roti diambil.");
            } else if (pilihBahan == 2 && stokBahan.get("Daging") > 0) {
                stokBahan.put("Daging", stokBahan.get("Daging") - 1);
                System.out.println("Daging diambil.");
            } else {
                System.out.println("Bahan tidak cukup.");
            }
    
            System.out.println("Memasak.....");
            try {
                Thread.sleep(random.nextInt(3000)); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(pesananTerakhir + " pesanan pelanggan telah siap.");
            
        } else if (pesananTerakhir.equals("Kentang Goreng")) {
            System.out.println("1. Ambil kentang");
            System.out.println("2. Ambil minyak");
            int pilihBahan = scanner.nextInt();
    
            if (pilihBahan == 1 && stokBahan.get("Kentang") > 0) {
                stokBahan.put("Kentang", stokBahan.get("Kentang") - 1);
                System.out.println("Kentang diambil.");
            } else if (pilihBahan == 2 && stokBahan.get("Minyak") > 0) {
                stokBahan.put("Minyak", stokBahan.get("Minyak") - 1);
                System.out.println("Minyak diambil.");
            } else {
                System.out.println("Bahan tidak cukup.");
            }
    
            if (stokBahan.get("Kentang") >= 0 && stokBahan.get("Minyak") >= 0) {
                System.out.println("Memasak.....");
                try {
                    Thread.sleep(random.nextInt(3000)); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Kentang goreng pesanan pelanggan telah siap.");
            } else {
                System.out.println("Tidak bisa memasak kentang goreng, bahan tidak cukup.");
            }
    
        } else if (pesananTerakhir.equals("Minuman")) {
            System.out.println("1. Ambil soda");
            int pilihBahan = scanner.nextInt();
    
            if (pilihBahan == 1 && stokBahan.get("Soda") > 0) {
                stokBahan.put("Soda", stokBahan.get("Soda") - 1);
                System.out.println("Soda diambil.");
            } else {
                System.out.println("Bahan tidak cukup.");
            }
    
            if (stokBahan.get("Soda") >= 0) {
                System.out.println("Memasak.....");
                try {
                    Thread.sleep(random.nextInt(3000)); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Minuman pesanan pelanggan telah siap.");
            } else {
                System.out.println("Tidak bisa memasak minuman, bahan tidak cukup.");
            }
        }
    }
    

    private static void cekStokBahan() {
        System.out.println("\n~~~~Bahan Makanan yang tersedia~~~");
        for (Map.Entry<String, Integer> entry : stokBahan.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void tambahStokBahan(Scanner scanner) {
        System.out.println("\nPilih stok bahan makanan yang ingin ditambah:");
        System.out.println("1. Roti : " + stokBahan.get("Roti"));
        System.out.println("2. Daging : " + stokBahan.get("Daging"));
        System.out.println("3. Kentang : " + stokBahan.get("Kentang"));
        System.out.println("4. Minyak : " + stokBahan.get("Minyak"));
        System.out.println("5. Soda : " + stokBahan.get("Soda"));

        int pilihanBahan = scanner.nextInt();
        System.out.println("Jumlah stok yang ingin ditambahkan: ");
        int jumlahTambah = scanner.nextInt();

        switch (pilihanBahan) {
            case 1:
                stokBahan.put("Roti", stokBahan.get("Roti") + jumlahTambah);
                break;
            case 2:
                stokBahan.put("Daging", stokBahan.get("Daging") + jumlahTambah);
                break;
            case 3:
                stokBahan.put("Kentang", stokBahan.get("Kentang") + jumlahTambah);
                break;
            case 4:
                stokBahan.put("Minyak", stokBahan.get("Minyak") + jumlahTambah);
                break;
            case 5:
                stokBahan.put("Soda", stokBahan.get("Soda") + jumlahTambah);
                break;
        }

        cekStokBahan();
    }
}
