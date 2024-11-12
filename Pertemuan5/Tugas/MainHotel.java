public class MainHotel {
    public static void main(String[] args) {
        Tamu tamu1 = new Tamu("12345", "Valentina");
        Hotel hotel = new Hotel("Hotel Kencana", 3);
        hotel.setTamu(tamu1, 1);
        System.out.println(hotel.info());
    }
}
