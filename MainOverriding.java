package PBO_pertemuan9;

public class MainOverriding {
    public static void main(String[] args) {
        System.out.println("OVERRIDING");
        System.out.println("===============================");
        System.out.println("MANUSIA BISA : ");
        Manusia manusia = new Manusia();
        manusia.bernafas();
        manusia.makan();

        System.out.println("===============================");
        System.out.println("DOSEN BISA : ");
        Dosen dosen = new Dosen();
        dosen.tampilManusia();
        dosen.makan();
        dosen.lembur();

        System.out.println("===============================");
        System.out.println("MAHASISWA BISA : ");
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.tampilManusia();
        mahasiswa.makan();
        mahasiswa.tidur();

        System.out.println("");
    }
}
