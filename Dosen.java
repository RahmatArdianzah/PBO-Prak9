package PBO_pertemuan9;

public class Dosen extends Manusia{
    public void makan(){
        System.out.println("makan");
    }
    public void lembur(){
        System.out.println("lembur");
    }
    public void tampilManusia(){
        super.bernafas();
        super.makan();
    }
}
