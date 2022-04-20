package LearnJava;

public class Operator {
    public static void main(String[] args){
        //Arithmetic operator
        int x = 1;
        int y = 2;
        int z = x+y;
        System.out.println(z);

        //Comperison Operator

        System.out.println(65>45);

        //Assignment Operator

        int a = 11;
         a +=10;
        System.out.println(a);

        //Logincal Operator  
        
            // && (logical and) 	Returns true if both operands are true. 	

            // x<y && x!=y --> True
            // || (logical or) 	Returns true if any of the operand is true. 	x<y && x==y --> True
            // ! (logical not) 	Returns true if the result of the expression is false and vice-versa 	

            // !(x<y && x==y) --> False
        System.out.println(56>23 && 56<23);
        System.out.println(56>23 || 12>51);
        System.out.println(!(56>23 && 56<223));

        //Bitwise Operator work on bits

    }
}
