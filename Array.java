package LearnJava;

public class Array {
    public static void main(String[] args){
        /*
        1st way
        int [] marks;
        marks = new int[5];
        */
        int [] marks = new int[5]; //2nd way
        marks[0] = 100;
        marks[1] = 130;
        marks[2] = 20;
        marks[3] = 40;
        marks[4] = 10;

        System.out.println(marks[3]);

        //3rd way

        String [] student = {"Student1","Student2","Student3","Student4"};
        System.out.println(student[3]);
    }
}
