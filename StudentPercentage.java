package LearnJava;
import java.util.*;

public class StudentPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks in Html = ");
        int Html = sc.nextInt();
        System.out.print("Enter Marks in C = ");
        int C = sc.nextInt();
        System.out.print("Enter Marks in CSS = ");
        int CSS = sc.nextInt();
        System.out.print("Enter Marks in JS = ");
        int JS = sc.nextInt();
        System.out.print("Enter Marks in Java = ");
        int Java = sc.nextInt();

        float per = (float)((Html + C + CSS + JS + Java)/5);
        System.out.print("Percentage = "+ per);
        sc.close();
    }
}
