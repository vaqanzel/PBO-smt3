//package Percobaan2;

public class ClassB extends ClassA{
    private int z;

    public void setZ(int z){
        this.z = z;
    }
    public void getNilaiZ(){
        System.out.println("nilai Z:"+z);
    }
    public void getJumlah(){
        System.out.println("jumlah:"+(x+y+z));
    }
}
