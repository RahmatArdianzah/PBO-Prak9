package PBO_pertemuan9;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();

        System.out.println("======= MENGHITUNG SEGITIGA =======");
        System.out.println();
        System.out.println("1. Menghitung keliling segitiga : " + sg.keliling(20, 20, 20));
        System.out.println("2. Menghitung keliling segitiga : " + sg.keliling(10, 10));
        System.out.println("3. Menghitung 1 Sudut Segitiga : " + sg.totalSudut(25));
        System.out.println("4. Menghitung 2 Sudut Segitiga : " + sg.totalSudut(25, 25));
    }
}
