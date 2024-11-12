public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas(){
        return (alas * tinggi)/2;
    }

    public float keliling(){
        float sisiMiring = (float) Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring; 
    }
    
}
