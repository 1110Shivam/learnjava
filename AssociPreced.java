package LearnJava;

public class AssociPreced {
    public static void main(String[] args) {
            int x = 40,y = 2;
            System.out.println((x-y)/2);

            int a=2,b=10,c=2,z;
            z = (b*b - (4*a*c))/(2*a);
            System.out.println(z);

            int v = 6,u  = 4;
            int m = v*v-u*u;
            System.out.println(m);
    }
}