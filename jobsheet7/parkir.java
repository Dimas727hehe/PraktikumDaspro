import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jenis = 1, total = 0, durasi;

        while (jenis != 0) {
            System.out.print("\nMasukkan Kendaraan\n\n1) Mobil\n2) Motor\n0) Exit\n\nChoice: ");
            jenis = s.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("\n");
                System.out.println("Durasi: ");
                durasi = s.nextInt();
                if(durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else if (jenis == 1) {
                        total += durasi * 2000;
                    }
                }
            }
        }

        System.out.println("Penghasilan anda sebesar: "+total);

        s.close();
    }
}
