import java.util.Scanner;

public class Tugas110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int jumlahTiket;
        int totalTiketTerjual = 0;
        double hargaPerTiket = 50000;
        double totalPenjualan = 0;
        String lanjut = "";
        
        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();
            
            if (jumlahTiket < 0) {
                System.out.println("Input jumlah tiket tidak valid! Silakan masukkan ulang.");
                continue; 
            }
            
            double hargaTotal = jumlahTiket * hargaPerTiket;
            double diskon = 0;
            
            // Perhitungan diskon berdasarkan ketentuan
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            
            double totalBayar = hargaTotal - (hargaTotal * diskon);
            
            // Akumulasi total keseluruhan dalam sehari
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalBayar;
            
            System.out.println("Total yang harus dibayar: Rp " + totalBayar);
            
            System.out.print("Apakah ingin menginput transaksi lagi? (y/t): ");
            lanjut = sc.next();
            
        } while (lanjut.equalsIgnoreCase("y"));
        
        System.out.println("\n--- REKAP PENJUALAN TIKET HARI INI ---");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total Pendapatan: Rp " + totalPenjualan);
        
        sc.close();
    }
}

