import java.util.Scanner;

public class bola {
    public static void main(String[] args) {
        String UserName;
        Scanner naufal = new Scanner(System.in);
        System.out.println("Input UserName : ");
        UserName = naufal.nextLine();
        double S;
        double r;
        double T;
        double S1;
        double S2;
        System.out.println("Masukan tinggi mula-mula");
        T = naufal.nextDouble();
        System.out.println("masukan tinggi lanjutan");
        r = naufal.nextDouble();
        S1 = T / (1-r);
        S2 = S1 * r;
        S = S1 + S2;
        System.out.println("jadi S naik total adalah :"+ S1 );
        System.out.println("jadi S turun total adalah :"+ S2 );
        System.out.println("jadi S total adalah :"+ S );
        System.out.println();
    }
}
