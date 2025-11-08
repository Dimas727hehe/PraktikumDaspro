import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jml = sc.nextInt();
        
        int[] nilaiMhs= new int[jml];
        double totalTdk = 0;
        double rata2Lus;
        double rata2Tdk;
        double totalLus = 0;
        int Lulus = 0;
        int Tidak = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLus += nilaiMhs[i];
                Lulus++;
            } else if (nilaiMhs[i] <= 70 && nilaiMhs[i] >= 0) {
                totalTdk += nilaiMhs[i];
                Tidak++;
            }
        }

        rata2Lus = totalLus/Lulus;
        rata2Tdk = totalTdk/Tidak;
        System.out.println("Rata-rata nilai lulus = "+rata2Lus);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2Tdk);
    }
}
