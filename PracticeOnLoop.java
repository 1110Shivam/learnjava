package LearnJava;

public class PracticeOnLoop {
    public static void main(String[] args) {
        // Write a program to print the following pattern :
        // ****
        // ***
        // **
        // *

        // for(int i = 4; i!=0; i--){
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        // int i = 4;
        // while(i!=0){
        //     int j = 0;
        //     while(j<i){
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.print("\n");
        //     i--;
        // }

        // Write a program to sum first n even numbers using a while loop and for loop.

        // int n = 3,i=0,sum = 0;
        // while(i<n){
        //     sum += 2*i;
        //     i++;
        // }
        // System.out.println(sum);

        // int n = 3 , sum = 0;
        // for(int i=0;i<n;i++){
        //     sum += 2*i;
        // }
        // System.out.println(sum);

        // Write a program to print the multiplication table of a given number n.
        // int n = 5;
        // for(int i = 1; i<=10;i++){
        //     System.out.printf("%d X %d = %d\n",n,i,n*i);
        // }

        // Write a program to print a multiplication table of 10 in reverse order.
        // for(int i = 10; i!=0;i--){
        //     System.out.printf("10 X %d = %d\n",i,10*i);
        // }

        // Write a program to find the factorial of a given number using for loops and while loop.
        // int n = 3,factorial = 1;
        // for(int i=1;i<=n;i++){
        //     factorial *= i;
        // }
        // System.out.println(factorial);
        // int n = 5, factorial = 1,i = 1;
        // while(i<=n){
        //     factorial *= i;
        //     i++;
        // }
        // System.out.println(factorial);

        // Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        int sum = 0;
        for(int i = 1; i<=2;i++){
            sum += 8*i;
        }
        System.out.println(sum);
    }
}
