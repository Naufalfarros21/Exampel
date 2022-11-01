import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner hasan = new Scanner(System.in);
        System.out.println("input password :");
        String password = hasan.nextLine();
        if (password.equals("javaclass")){
            System.out.println("password benar");
        }else{
            System.out.println("passowrd salah");
        }
    }
}
