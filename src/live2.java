import java.util.Scanner;

public class live2 {
    public static void main(String[] args) {
        Scanner gopal = new Scanner(System.in);
        int angka1, hasil;
        System.out.println("masukan angka :");
        angka1 = gopal.nextInt();
        hasil = angka1 * angka1;
        if (hasil >= 10 && hasil <= 30){
            System.out.println("hasilnya adalah :" + hasil);
        }
    }
}
