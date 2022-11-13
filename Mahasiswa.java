package PBO_pertemuan9;

public class Mahasiswa extends Manusia{
    public void makan(){
        System.out.println("makan");
    }
    public void tidur(){
        System.out.println("tidur");
    }
    public void tampilManusia(){
        super.bernafas();
        super.makan();
    }
}
