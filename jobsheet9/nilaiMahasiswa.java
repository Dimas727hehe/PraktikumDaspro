import java.util.Scanner;

public class nilaiMahasiswa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] nilai;
        double nilall=0;
        int tertinggi=0;
        int terendah=100;

        System.out.print("Jumlah nilai yang akan diinput: ");
        int banyak=s.nextInt();

        nilai = new int[banyak];

        for (int i=0; i<nilai.length; i++) {
            System.out.print("Nilai mahasiswa ke-"+(i+1)+": ");
            nilai[i]=s.nextInt();
        }

        for (int j=0; j<nilai.length; j++) {
            nilall+=nilai[j];
        }

        for (int h=0; h<nilai.length; h++) {
            if (nilai[h]<terendah) {
                terendah=nilai[h];
            }

            if (nilai[h]>tertinggi) {
                tertinggi=nilai[h];
            }
        }

        System.out.print("Rata-rata nilai: "+(nilall/nilai.length)+"\n");
        System.out.print("Nilai tertinggi: "+(tertinggi)+"\n");
        System.out.print("Nilai terendah: "+(terendah)+"\n");

        System.out.print("Mahasiswa ke- \t");
        for (int k=0; k<nilai.length; k++) {
            System.out.print((k+1)+" \t");
        }
        System.out.print("\n");
        System.out.print("Nilai: \t\t");
        for (int l=0; l<nilai.length; l++) {
            System.out.print((nilai[l])+" \t");
        }
        
    }
}
