import java.util.Scanner;

public class live {
    public static void main(String[] args) {
        Scanner naufal = new Scanner(System.in);
        int input1, input2, hasil;
        System.out.print("masukan input1 :");
        input1 = naufal.nextInt();
        System.out.print("masukan input2 :");
        input2 = naufal.nextInt();

        if ((input1 %2==0||input2 %2==0)){
            hasil = input1 * input2;
            System.out.println("hasilnya adalah :" + hasil);
        }
    }
}
