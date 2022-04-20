package LearnJava;
import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = sc.nextByte();

        if(age<18){
            System.out.println("You are below 18");
        }
        else if(age>18 && age<=23){
            System.out.println("You age between 18 to 23");
        }
        else if(age<=127){
            System.out.println("You are above 23");
        }
        else
            System.out.println("You entered invalid age");

        //Not operator !
        boolean a = true;
        boolean b = false;

        System.out.println(!a);
        System.out.println(!b);

        sc.close();
        
    }
}
