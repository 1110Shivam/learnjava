package LearnJava;

public class loop {
    public static void main(String[] args){
        //Write a program to print natural numbers from 100 to 200 using while loop.

        int i = 100;
        while(i<=200){
            System.out.println(i);
            i++;
        }

        //Write a program to print first n natural numbers using a do-while loop.
        int j=1,n = 12;
        do{
            System.out.println(j);
            j++;
        }while(j<=n);

        int b = 10;
        do {
            System.out.println(b);
            b++;
        }while(b<5);

        //Write a program to print first n odd numbers using a for loop.
        int num = 3;
        for(int k = 0; k < num; k++){
            //2n+1
            int t = 2*k+1;
            System.out.println(t);
        }

        //Write a program to print first n natural numbers in reverse order.
        int number = 11;
        for(int l = number; l!=0; l--){
            System.out.println(l);
        }
    }
}
