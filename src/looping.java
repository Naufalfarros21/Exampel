import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        Scanner gopal = new Scanner(System.in);
        int angka;
        int faktorial = 1;
        System.out.println("masukan angka: ");
        angka = gopal.nextInt();
        for (int i = 1; i<= angka; i++){
            faktorial = faktorial*i;
        }
        System.out.println("hasilnya: "+ faktorial);
    }
}
