public class School
{
   public static void main (String [] args)
   {

      Student mary = new Student("Mary", 12, 7, 'D');
      Student hanna = new Student("Hanna", 13, 8, 'E');
      Student delz = new Student("Delz", 14, 9, 'F');

      Teacher spark = new Teacher("Spark", 42, 5, 'D', "English");
      Teacher mpambo = new Teacher("Mpambo", 13, 6, 'E', "Maths");
      Teacher mbeki = new Teacher("Mbeki", 14, 7, 'F', "History");

      Secretary ruth = new Secretary("Ruth", "Golembo", 40, 15000, "5years");
      Secretary rhulani = new Secretary("Rhulani", "Shiyiwe" , 32, 10000, "4years");
      Secretary renny = new Secretary("Renny", "Mboza", 45, 16000, "6years");

      System.out.println("Students\n");
      System.out.println(mary + "\n");
      System.out.println(hanna + "\n");
      System.out.println(delz);

      
      System.out.println("Teachers\n");
      System.out.println(spark + "\n");
      System.out.println(mpambo + "\n");
      System.out.println(mbeki);

      
      System.out.println("Secretary\n");
      System.out.println(ruth + "\n");
      System.out.println(rhulani + "\n");
      System.out.println(renny);

   }
}