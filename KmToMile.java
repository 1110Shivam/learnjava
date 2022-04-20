package LearnJava;
import java.util.*;

public class KmToMile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter km = ");
        float Km = sc.nextFloat();
        float Mi = (float)(Km * 0.62137);
        System.out.print("Miles = "+ Mi);

        sc.close();
    }
}
