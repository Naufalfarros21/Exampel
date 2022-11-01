import java.util.Scanner;

public class exfor {
    public static void main(String[] args) {
        Scanner gopal = new Scanner(System.in);
        int input1;
        int input2;
        int hasil;
        System.out.println("masukan input1: ");
        input1 = gopal.nextInt();
        System.out.println("masukan input2: ");
        input2 = gopal.nextInt();
        for (int n=input1; n<=input2; n++){
            if ((n%3==0)&&(n%7==0)){
                System.out.println("angka:"+ n);
            }else {
                System.out.println("tidak ada angka kelipatan 3 dan 7");
            }
        }
    }
}
