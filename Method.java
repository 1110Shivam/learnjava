package LearnJava;

public class Method {
    // 1. using static keyword
    static int Add(int x, int y){
        int z = x + y;
        return(z);
    }

    // 2 Using class
    int sum(int m, int n){
        int o = m + n;
        return(o);
    }
    public static void main(String[] args) {
        int a = 4,b=5;  
        int c = Add(a,b);
        System.out.println(c);

        Method obj = new Method();
        int k = obj.sum(5, 6);
        System.out.println(k);
    }
}
