package LearnJava;

public class Varargs {
    static void fun(int ...arr){
        int sum = 0;
        for (int e: arr){
            sum += e;
        }
        System.out.println(sum);
    }

    static void add(int x, int ...arr){
        int sum = x;
        for(int e: arr){
            sum += e;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        fun();
        fun(1,2,3);
        fun(1,2,21,3);
        fun(1,2,3,4,2,0);
        
        // add(); throws error
        add(1,2,3);
        add(1,2,21,3);
        add(1,2,3,4,2,0);
    }
    
}
