public class Recursion {
    public static void main(String[] args)
    {

        //System.out.println(reverseString("Hallo World"));//calling of reverse function
        //System.out.println(fibonacci(7));

    }

    public static String reverseString(String str)//creating function to reverse string
    {
        if(str.length() <= 1)//base code if string is only 1 or less character it wont start function and only return that 1 character or nothing

            return str;//return only of base code
        else
            return reverseString(str.substring(1,str.length()))+str.charAt(0);//recursion function to reverse string

    }

    public static int fibonacci(int n)//creating function to give fibonacci number
    {
        if(n <=1 )//base code for if its smaller than 1 it only return number
            return n;//return only of base code
        else
            return fibonacci(n-1)+fibonacci(n-2);//recursion function to give fibonacci number
    }



}
