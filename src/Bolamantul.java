import java.util.Scanner;

public class Bolamantul {
    public static void main(String[] args) {
        String UserName;
        Scanner Naufal = new Scanner(System.in);
        System.out.println("Input UserName :");
        UserName = Naufal.nextLine();
        double S, r, t, S1, S2;
        System.out.println("Input tinggi mula-mula :");
        t = Naufal.nextDouble();
        System.out.println("Coef r :");
        r = Naufal.nextDouble();
        S1 = t / (1-r);
        S2 = S1 * r;
        S = S1 + S2;
        System.out.println("S1 adalah awal" + S1);
        System.out.println("S2 adalah akhir" + S2);
        if (S%2==0){
            System.out.println("maka bilanganya genap");
        }else{
            System.out.println("maka bilanganya ganjil");
        }
    }
}
