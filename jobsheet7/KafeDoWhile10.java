import java.util.Scanner;

public class KafeDoWhile10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String namaPelanggan;
        int kopi, teh, roti, totalHarga, hargaKopi = 12000, hargeTeh = 7000, hargaRoti = 20000;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar)");
            namaPelanggan = s.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalakan.");
                break;
            }

            System.out.println("Jumlah kopi: ");
            kopi = s.nextInt();
            System.out.println("Jumlah teh: ");
            teh = s.nextInt();
            System.out.println("Jumlah roti: ");
            roti = s.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargeTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp." + totalHarga);
            s.nextLine();

        } while (true);

        System.out.println("Semua transaksi selesai.");

        s.close();
    }
}
