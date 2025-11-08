import java.util.Scanner;

public class persegi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Segi 4 ukuran brp? ");
        int bentuk = s.nextInt();
        System.out.println("\n");

        for (int i = 1; i <= bentuk; i++) {
            if (i == 1 || i == bentuk) {
                for (int j = 1; j <= bentuk; j++){
                    System.out.print(bentuk+" ");
                }
            } else {
                if (i == 1 || i == bentuk) {
                    System.out.println(bentuk);
                } else {
                    for (int j = 1; j <= bentuk; j++) {
                        if(j == 1 || j == bentuk) {
                            System.out.print(bentuk+" ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
            }
            System.out.print("\n");
        }
    }         
}

