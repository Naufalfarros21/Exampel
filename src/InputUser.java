import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        String studentName;
        int studentAge;
        Scanner hasan = new Scanner(System.in);
        System.out.println("input Fullname : ");
        studentName = hasan.nextLine();
        System.out.println("input Age : ");
        studentAge = hasan.nextInt();
        System.out.println("Your FullName is " + studentName);
        System.out.println("Your Age Is " + studentAge);

        System.out.println();
    }
}
