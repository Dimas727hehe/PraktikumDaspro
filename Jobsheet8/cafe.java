import java.util.Scanner;;

public class cafe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jumah cabang kafe: ");
        int cabang = s.nextInt();
        int pelangganTot = 0;
        int itemTot = 0;
        int itemSemua = 0;

        System.out.print("\n\n === Input Penjualan Per Cabang === \n");

        for (int i = 1; i <= cabang; i++) {
            int pelanggan = 0; 
            int item = 0;
            itemTot = 0;
            System.out.println("\n--- Cabang "+i+" ---");
            System.out.print("Jumlah pelanggan: ");
            pelanggan = s.nextInt();

            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan "+j+" memesan berapa item? ");
                item = s.nextInt();
                itemTot = itemTot + item;
            }
            System.out.println("Cabang "+i+":");
            System.out.println("- Pelanggan: "+pelanggan+" orang");
            System.out.println("- Item terjual: "+itemTot);
            pelangganTot += pelanggan;
            itemSemua = itemSemua + itemTot;
        }
        System.out.println("\nTotal seluruh cabang:\nPelanggan: "+pelangganTot+" orang\nItem terjual: "+itemSemua+" item");
    }
}
