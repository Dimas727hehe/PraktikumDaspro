package jobsheet5.tugas3;

import java.util.Scanner;

public class tugas2_10 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Masukkan angka:");
        int angka = S.nextInt();

        if(angka % 2 == 0) {
            System.out.println("Angka yang anda inputkan (" + angka + ") merupakan bilangan genap.");
        } else {
            System.out.println("Angka yang anda inputkan (" + angka + ") merupakan bilangan ganjil.");
        }

        S.close();
    }
}
