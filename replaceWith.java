public class replaceWith {
    public static void main(String[] args)
    {


        System.out.println(replaceWith("h","h","@@"));//calling of method



    }

    public static String replaceWith(String str1 ,String str2, String str3)//creating of method
    {


        if (str1.length() <=1)//base code for if its smaller than 1 it only return string

            return str1;//return of string
        else


            return str1.replace(str2, str3);//function
        //return replaceWith(str1.replace(str2,str3));  if i want to use this as my code it gives me a error
    }


}
