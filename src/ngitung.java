import java.util.Scanner;

public class ngitung {
    public static void main(String[] args) {
        String UserName;
        Scanner naufal = new Scanner(System.in);
        System.out.println("masukan Nama :");
        UserName = naufal.nextLine();
        double r, S1, S2;
        System.out.println("masukan score 1 :");
        S1 = naufal.nextDouble();
        System.out.println("masukan score 2 :");
        S2 = naufal.nextDouble();
        r = (S1 + S2) / 2;
        System.out.println("rata ratanya adalah :"+ r);
        if (r > 80){
            System.out.println("lulus");
        }else{
            System.out.println("tidak lulus");
        }
    }
}
