import java.util.Scanner;

public class petugasBioskop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ada berapa pelanggan hari ini: ");
        int pelanggan = s.nextInt();
        double hargaTiket = 50000;
        int i = 1; 
        int habisTiket = 0;
        double diskon = 0.0;
        double diskTiket = 0;

        if (pelanggan <= 0) {
            System.out.println("Anda mungkin sedang berlibur atau mungkin belum beruntung");
        }

        while (i <= pelanggan) {
            double totTiket = 0;
            System.out.print("Pelanggan ke-"+i+" membeli berapa tiket: ");
            int jmlTiket = s.nextInt();

            if (jmlTiket < 0) {
                System.out.println("tidak valid mohon input ulang");
                continue;
            } else {
                if (jmlTiket > 10) {
                    diskon = 0.15;
                } else if (jmlTiket > 4) {
                    diskon = 0.10;
                } else {
                    diskon = 0.0;
                }
            }

            for (int j = 1; j <= jmlTiket; j++){
                totTiket = totTiket + hargaTiket;
                habisTiket ++;
            }

            diskTiket = diskTiket + (totTiket - (totTiket*diskon));

            i++;
            System.out.println("Total pembayaran pelanggan-"+i+": "+(totTiket - (totTiket*diskon))+"\n");
        }

        System.out.println("Total pembelian tiket hari ini: "+diskTiket);
        System.out.println("Dengan jumlah penjualan tiket: "+habisTiket);

        s.close();
    }
}