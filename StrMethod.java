package LearnJava;

public class StrMethod {
    public static void main(String[] args) {
        String str1 = "String";
        String str2 = new String("Another String");
        System.out.println(str1);
        System.out.println(str2);

        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        System.out.format("The value of a is %d and value of b is %f", a, b);

        // String Method
        // ---------------------------------------------------------------------------------------------------------------------------------------------------

        // To find the length of any string
        int value = str1.length();
        System.out.println(value);

        // To convert lower case of any string
        String lCase = str2.toLowerCase();
        System.out.println(lCase);

        // To convert Uppercase of any string
        String UCase = str1.toUpperCase();
        System.out.println(UCase);

        // To Trim any string from both side (Front and Back)
        String trm = "      Trim       ";
        String trim = trm.trim();
        System.out.println(trim);

        // substring() give the new string from the index which is given by us.
        String substr = str1.substring(3);
        System.out.println(substr);

        substr = str2.substring(2, 13);
        System.out.println(substr);

        // To replace a character or string
        String replaceStr = str1.replace('S', 'O');
        System.out.println(replaceStr);
        String replaceStr2 = str2.replace("Ano", "O");
        System.out.println(replaceStr2);

        // To check given string is started form or not
        boolean starStr = str1.startsWith("Srt");
        System.out.println(starStr);

        // To check given string is end form or not
        System.out.println(str2.endsWith("ng"));
        
        // To print the character of the given string
        System.out.println(str1.charAt(3));

        // To print the index of the given string
        System.out.println(str1.indexOf("r"));

        // To print the index of the given string from the given index
        System.out.println(str1.indexOf("sh",2));
        
        // To print the index of the given string from the last 
        String name = "Shivavam";
        System.out.println(name.lastIndexOf("v"));
        System.out.println(name.lastIndexOf("v",4));

        System.out.println(name.equals("ShIvavam"));
        System.out.println(name.equalsIgnoreCase("ShIvavam"));

        System.out.println("This is a back slash \\");


    }
}
