package SOALMUDAH_1;

import java.util.Scanner;

public class soalnumber1bagian1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Paket;

        double jarakPaket;
        System.out.println("Masukkan Jarak Paket (KM):");
        jarakPaket = input.nextDouble();

        double volumePaket;

        double kgPaket;
        System.out.println("Masukkan Berat Paket (kg):");
        kgPaket = input.nextDouble();

        double hargaPaket;

        if (jarakPaket > 10) {
            hargaPaket = 6000 * kgPaket;
        } else {
            hargaPaket = 4000 * kgPaket;
        }

        double panjang;
        System.out.println("Masukkan Panjang Paket (cm):");
        panjang = input.nextDouble();

        double lebar;
        System.out.println("Masukkan Lebar Paket (cm):");
        lebar = input.nextDouble();

        double tinggi;
        System.out.println("Masukkan Tinggi Paket (cm):");
        tinggi = input.nextDouble();

        volumePaket = panjang * lebar * tinggi;

        double biayavolume;

        if (volumePaket > 100) {
            biayavolume = 50000 + kgPaket;
        } else {
            biayavolume = 0;
        }

        double Total = biayavolume + hargaPaket;

        System.out.println("---------Rincian Biaya---------");
        System.out.println("Biaya Berat Paket: " + hargaPaket);
        System.out.println("Biaya Volume Paket: " + biayavolume);
        System.out.println("Total Biaya Pengiriman: " + Total);

    }
}
