package LearnJava;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random r = new Random();
        int com = r.nextInt(1,4);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for rock, 2 for paper, 3 for scissors = ");
        int user = sc.nextInt();

        if((user == 1 && com == 1)||(user == 2 && com == 2)||(user == 3 && com == 3)){
            System.out.println("Game drawn.");;
        }
        else if((user == 1 && com == 2)||(user == 2 && com == 3)||(user == 3 && com == 1)){
            System.out.println("Computer Wins.");
        }
        else
            System.out.println("You Win.");
        System.out.println("computer entered = " + com);
    }
}
