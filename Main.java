package LearnJava;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of Java = ");
        byte java = sc.nextByte();
        System.out.print("Enter Marks of DBMS = ");
        byte dbms = sc.nextByte();
        System.out.print("Enter Marks of DS = ");
        byte ds = sc.nextByte();

        float per = (float)(java+dbms+ds)/3;
        System.out.println(per);

        if(java>=33 && dbms>=33 && ds>=33 && per>=40 ){
            System.out.println("Pass");
        }
        else
            System.out.println("Fail");

        //CALCULATE TAX

        System.out.print("Enter your income slab = ");
        float in = sc.nextFloat();
        float tax = 0;

        if (in < 2.5f) {
            tax = tax + 0;
        }
        else if (in <= 2.5f && in >= 5.0f) {
            tax = tax + 0.05f * (in - 2.5f);
        }
        else if (in <= 250000 && in >= 500000) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (in - 5f);
        }
        else if (in <= 250000 && in >= 500000) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (in - 10.0f);
        }

        System.out.println("The total tax paid by the employee is : " + tax);

        System.out.print("Enter your choice = ");
        byte ch = sc.nextByte();
        switch(ch){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Your choice is invalid...");
        }
    }
}
