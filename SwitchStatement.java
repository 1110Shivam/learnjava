package LearnJava;

public class SwitchStatement {
    public static void main(String[] args){
        int ch = 1;

        //Traditional Switch
        switch(ch){
            case 1:
                System.out.println("This is case 1.");
                break;
            case 2:
                System.out.println("This is case 2.");
                break;
            case 3:
                System.out.println("This is case 3.");
                break;
            case 4:
                System.out.println("This is case 4.");
                break;
            default:
                System.out.println("This is default case.");
        }        

        //Enhanced switch

        int choice = 50;

        switch(choice){
            case 10 -> {
                System.out.println("This is case 10.");
                System.out.println("This is case 10.");
                System.out.println("This is case 10.");
            }
            case 20 -> System.out.println("This is case 20.");
            case 30 -> System.out.println("This is case 30.");
            case 40 -> System.out.println("This is case 40.");
            case 50 -> System.out.println("This is case 50.");
            default -> System.out.println("This is default case");
        }
    }
}
