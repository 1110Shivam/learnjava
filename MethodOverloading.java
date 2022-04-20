package LearnJava;

public class MethodOverloading {

    public static void fun(){
        System.out.println("This is function");
    }
    public static void fun(int a){
        System.out.println("This is function" + a);
    }
    public static void fun(int a , int b){
        System.out.println("This is function" + a + b);
    }
    public static void main(String[] args) {
        fun();
        fun(34);
        fun(12,123);
    }
    
}
