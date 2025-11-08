import java.util.Scanner;

public class menghitugKuadrat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Mau menjumlahkan brp kuadrat? ");
        int kuadrat = s.nextInt();
        int jumlahKuadrat = 0;
        int totalKuadrat = 0;
        System.out.println("\n");

        for (int i = 1; i <= kuadrat; i++ ) {
            totalKuadrat = 0;
            System.out.print("n = "+i+" → jumlah kuadrat = ");

            for (int j = 1; j <= i; j++){
                jumlahKuadrat = j*j;
                totalKuadrat += jumlahKuadrat;
                if (j == 1){
                    System.out.print(jumlahKuadrat);
                } else {
                    System.out.print(" + "+jumlahKuadrat);
                }
            }

            if (i == 1){
                    System.out.print("");
                } else {
                    System.out.print(" = "+totalKuadrat);
                }
            
            System.out.print("\n");
        }
    }
}
