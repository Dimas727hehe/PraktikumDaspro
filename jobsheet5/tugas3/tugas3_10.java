package jobsheet5.tugas3;

import java.util.Scanner;

public class tugas3_10 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int kreditSiswa=0;

        System.out.println("Apakah anda Mahasiswa atau Dosen?");
        String pengguna = i.nextLine();

        System.out.println("Apa anda mahasiswa atau sudah daftar online?");
        System.out.print("Kartu mahasiswa? ");
        boolean kartuMahasiswa = i.nextBoolean();
        System.out.print("daftar online? ");
        boolean datarOnline = i.nextBoolean();

        if(kartuMahasiswa == true || datarOnline == true) {
            System.out.println("Mahasiswa boleh masuk");
        } else {
            System.out.println("Mahasiswa tidak boleh masuk");
        }
        
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
