package jobsheet5;

import java.util.Scanner;

public class Tugas3_10 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int kreditSiswa=0;

        System.out.println("Apakah anda Mahasiswa atau Dosen?");
        String pengguna = i.nextLine();
        
        if (pengguna.equalsIgnoreCase("dosen") || pengguna.equalsIgnoreCase("mahasiswa")) {
            if(pengguna.equalsIgnoreCase("mahasiswa")) {
                System.out.print("Masukkan sks anda: ");
                kreditSiswa = i.nextInt();
                if(kreditSiswa >= 12) {
                    System.out.println("Akses Wi-Fi diberikan (mahsiswa aktif).");
                } else {
                    System.out.println("Akses Wi-Fi ditolak, SKS kurang dari 12.");
                }
            } else {
                System.out.println("Akses Wi-Fi diberikan (dosen).");
            }
        } else {
            System.out.println("Akses Wi-Fi ditolak");
        }
    
        i.close();
    }
}
