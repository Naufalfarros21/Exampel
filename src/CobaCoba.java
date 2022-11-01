import java.util.Scanner;

public class CobaCoba {
    public static void main(String[] args) {
        //Cetak Bilangan dari 1 sampai 10
        //Tanpa menggunakan looping for

        Scanner gopal = new Scanner(System.in);
        String[] Belanjaan = new String[10];
        for (int i=0; i<Belanjaan.length; i++){
            System.out.println("Masukan Nama Barang: ");
            Belanjaan[i]= gopal.nextLine();
        }

        int j=0;
        do {
            System.out.println("Masukan Nama Barang: ");
            Belanjaan[j]= gopal.nextLine();
            j++;
        }while (j<Belanjaan.length);
    }
}
