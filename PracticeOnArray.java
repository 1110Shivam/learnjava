package LearnJava;

public class PracticeOnArray {
    public static void main(String[] args){
    // Create an array of 5 floats and calculate their sum.
        float [] arr = {23.34f,23.54f,12.89f,67.34f,21.78f};
        float sum = 0;
        for(float e:arr){
            sum += e;
        }
        System.out.println(sum);

    // Write a program to find out whether a given integer is present in an array or not.
        int [] no = {12,23,25,78,23};
        int n = 25;
        boolean b1 = false;
        for(int i = 0; i<no.length;i++){
            if(n==no[i]){
                b1 = true;
                break;
            }
        }
        if(b1 == true){
            System.out.println("Given integer present in this array.");
        }
        else
            System.out.println("Given integer is not present in this array.");

    // Calculate the average marks from an array containing marks of all students in physics using a for-each loop.        
        int [] marks = {12,23,25,78,23};
        int sum1 = 0;
        for(int e: marks){
            sum1 += e;
        }
        float ave = (float)sum1/marks.length;
        System.out.println("The Average is: " + ave);

    // Create a Java program to add two matrices of size 2x3.
        int [][] mat1 = {{1,2,3},
                         {4,5,3}};
        int [][] mat2 = {{1,2,3},
                         {4,3,3}};
        int [][] res = {{0,0,0},
                         {0,0,0}};
        
        for(int i = 0; i<mat1.length;i++){
            for(int j = 0; j<mat1[i].length;j++){
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i = 0; i<res.length;i++){
            for(int j = 0; j<res[i].length;j++){
                System.out.print(res[i][j] + "\t");
            }
            System.out.println("");
        }
    // Write a Java program to reverse an array.
        int [] ar = {12,23,25,52,78,23};
        int l = ar.length;
        int num = Math.floorDiv(l, 2),temp;
        for(int i = 0;i<num;i++){
            temp = ar[i];
            ar[i] = ar[l-i-1];
            ar[l-i-1] = temp;
        }
        System.out.println("Print reverse array.");
        for(int e:ar){
            System.out.print(e + " ");
        }
    
    // Write a Java program to find the maximum element in an array.
        int [] array = {12,23,25,52,78,23};
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("\nMaximum element in this array is: "+ max);

    // Write a Java program to find the maximum element in a Java array.
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<array.length;i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("\nMinimum element in this array is: "+ min);

    // Write a Java program to find whether an array is sorted or not.
        int [] newArray = {2,2,3,21,34,54};
        boolean isSorted = true;
        for(int i = 0; i<newArray.length-1;i++){
            if(newArray[i]>newArray[i+1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Given array is sorted.");
        }
        else
            System.out.println("Given array is not sorted.");

            int na = 2;
        if(na>2){
            System.out.println("true");
        }
        else
            System.err.println("false");
    }
}
