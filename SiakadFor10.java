import java.util.Scanner;

public class SiakadFor10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int JumlahLulus = 0;
        int jumlahTidakLulus = 0;
        double batasKelulusan = 60.0;

        for (int i = 1;  i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= batasKelulusan) {
                JumlahLulus++;
            }else {
                jumlahTidakLulus++;
            }
        }

        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " + JumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + jumlahTidakLulus);
    }
}