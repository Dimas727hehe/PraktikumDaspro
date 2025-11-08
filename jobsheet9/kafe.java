import java.util.Scanner;

public class kafe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] makanan;
        int[] harga;
        int hargaall=0;

        System.out.print("Pesan berapa? ");
        int jmlMakanan=s.nextInt();
        makanan = new String[jmlMakanan];
        harga = new int[jmlMakanan];

        for (int i=0; i<makanan.length; i++) {
            System.out.print("Makanan apa: ");
            makanan[i]=s.nextLine();
            makanan[i]=s.nextLine();
            System.out.print("Harganya berapa?\nRp.");
            harga[i]=s.nextInt();
        }

        for (int j=0; j<makanan.length; j++) {
            hargaall+=harga[j];
        }

        System.out.println("Total harga pesanan adalah: "+hargaall);
        System.out.print("Makanan: \t");
        for (int k=0; k<makanan.length; k++) {
            System.out.print((makanan[k])+" \t");
        }
        System.out.print("\n");
        System.out.print("Harga: \t\t");
        for (int l=0; l<makanan.length; l++) {
            System.out.print((harga[l])+" \t");
        }
    }
}
