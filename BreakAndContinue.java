package LearnJava;

public class BreakAndContinue {
    public static void main(String[] args) {
        // for(int i = 0; i<=5;i++){
        //     System.out.println(i);
        //     if(i==3){
        //         System.out.println("Start Break statement..");
        //         break;
        //     }

        // }

        int j = 0;
        while(j<=5){
            System.out.println(j);
            j++;
            if(j==3){
                System.out.println(j);
                System.out.println("The continue statement start..");
                continue;
            }
            System.out.println("This is after the continue..");
        }
    }    
}
