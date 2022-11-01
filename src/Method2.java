import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Method2 {
    public static void Penjumlahan (int a, int b){
        int hasil_jumlah = a+b;
        System.out.println("Hasilnya: "+ hasil_jumlah);
    }

    public static void main(String[] args) {
        // Penjumlahan(3,4);
        // Penjumlahan(6,10);
        // Penjumlahan(1000,10);


        Scanner gopal = new Scanner(System.in);
        System.out.println("Masukan Angka 1: ");
        int angka1 = gopal.nextInt();
        System.out.println("Masukan Angka 2: ");
        int angka2 = gopal.nextInt();
        Penjumlahan(angka1,angka2);
    }

}
