import java.util.Scanner;

public class kafe1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String target;
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Choocolate Ice"};

        System.out.println("Mau cari makanan apa? ");
        target=s.nextLine();
        
        for (int i=0; i<menu.length; i++) {
            if(target.equalsIgnoreCase(menu[i])) {
                System.out.println("Makanan ditemukan\nAda di menu nomer "+(i+1));
                break;
            } else {
                System.out.println("Makanan tidak ditemukan");
                break;
            }
        }
    }
}
