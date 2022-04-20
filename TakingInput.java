package LearnJava;
import java.util.*;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Addition of two interger no 
        System.out.print("Enter First No = ");
        int a = sc.nextInt();
        System.out.print("Enter Second No = ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum = "+sum);

        // //Additon of two float no

        System.out.print("Enter First No = ");
        float f1 = sc.nextFloat();
        System.out.print("Enter Second No = ");
        float f2 = sc.nextFloat();
        float Sum = f1 + f2;
        System.out.print("Sum = "+Sum);

        //Check user entered int or not

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        //Taking string from user

        String str = sc.next();
        System.out.println(str);
        String str1 = sc.nextLine();
        System.out.println(str1);
        

        sc.close();
    }
}
