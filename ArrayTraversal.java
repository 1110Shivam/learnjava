package LearnJava;

public class ArrayTraversal {
    public static void main(String[] args) {
        int [] arr = {34,34,54,46,23,64};

        //Array Traversal Using for loop
        System.out.println("Array Traversal Using For Loop:");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // Write a Java program to print the elements of an array in reverse order.
        System.out.println("Array Traversal In Reverse Order Using For Loop:");
        for(int i = arr.length-1;i>0;i--){
            System.out.println(arr[i]);
        }

        //Array Traversal Using For-each loop
        System.out.println("Array Traversal Using For-each Loop:");
        for(int i:arr){
            System.out.println(i);
        }
    }    
}
