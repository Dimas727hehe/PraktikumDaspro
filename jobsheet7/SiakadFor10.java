import java.util.Scanner;

public class SiakadFor10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jmlLulus = 0, jmlTdk = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = s.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai > 60){
                jmlLulus++;
            } else {
                jmlTdk++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Yang lulus ada: " + jmlLulus);
        System.out.println("Yang tidak lulus ada: " + jmlTdk);

        s.close();
    }
}