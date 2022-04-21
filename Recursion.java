package LearnJava;

public class Recursion {
    static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n * factorial(n-1);                 
    }
    static int Fact(int n){
        int product = 1;
        if(n==0||n==1){
            return 1;
        }
        else{
            for(int i=1;i<=n;i++){
                product *= i;
            }
        }
        return product;
    }
    public static void main(String[] args) {
        System.out.println("Factorial = "+factorial(5));
        System.out.println("Factorial = "+Fact(6));
    }
    
}
