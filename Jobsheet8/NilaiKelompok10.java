import java.util.Scanner;

public class NilaiKelompok10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j, kelniltinggi = 0, kelnilrendah = 0, nilai;
        float totalNilai=0, tertinggi = 0, terendah = 100, rataNilai;

        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (j=1;j<=5;j++) {
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);

            if (rataNilai > tertinggi) {
                tertinggi = rataNilai;
                kelniltinggi = i;
            }
            if (rataNilai < terendah) {
                terendah = rataNilai;
                kelnilrendah = i;
            }

            i++;
        }
        System.out.println();
        System.out.println("Kelompok "+kelniltinggi+" memiliki rata2 nilai tertinggi dengan rata "+tertinggi);
        System.out.println("Kelompok "+kelnilrendah+" memiliki rata2 nilai terendah dengan rata "+terendah);
    }
}
