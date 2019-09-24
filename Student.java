public class Student {

	// Attributes
   String name;
   int age;
   int grade;
   char registrationClass;
	
	// Methods
   public Student(String name, int age, int grade, char registrationClass) {
      this.name = name;
      this.age = age;
      this.grade = grade;
      this.registrationClass = registrationClass;
   }
   Student mary = new Student("Mary", 12, 7, 'D');
   Student hanna = new Student("Hanna", 13, 8, 'E');
   Student delz = new Student("Delz", 14, 9, 'F');


   public String getName() {
      return name;
   }
	
   public char getRegistrationClass() {
      return registrationClass;
   }
   
   public String toString() {
      String output = "Name: " + name;
      output += "\nAge:" + age;
      output += "\nGrade:" + grade;
      output += "\nRegistration class:" + registrationClass;


      System.out.println("Students\n");
      System.out.println(ruth.toString()+"\n");
      System.out.println(rhulani.toString()+"\n");
      System.out.println(renny.toString());
   
      return output;
   }

}
