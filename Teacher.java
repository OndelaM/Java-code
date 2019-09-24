public class Teacher {
    //Attributes
    String name;
    int age;
    int grade;
    Char teachingClass;
    String teachingSubject;


    // This is the constructor of the class Teacher/ method
    public Teacher (String name, int age, int grade, Char teachingClass, String teachingSubject) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.teachingClass = teachingclass;
        this.teachingSubject = teachingSubject;
    }
    Teacher spark = new Teacher("Spark", 42, 5, 'D', "English");
    Teacher mpambo = new Teacher("Mpambo", 13, 6, 'E', "Maths");
    Teacher mbeki = new Teacher("Mbeki", 14, 7, 'F', "History");

    // Assign the age of the Teacher to the variable age.
    public String getName(){
        return name;
    }

    // Assign the teaching class
    public Char getTeachingclass() {
        return teachingClass;
    }
    //Assign the subject taught
    public String getTeachingSubject(){
        return teachingSubject;
    }

    // Print the Teacher details */
    public String toString() {
        String output = "Name:"+ name;
        output += "\nAge:" + age;
        output += "\nGrade:" + grade;
        output += "\nClass:" + teachingClass;
        output += "\nSubject:" + teachingSlass;
        
        System.out.println("Teachers\n");
        System.out.println(spark.toString()+"\n");
        System.out.println(mpambo.toString()+"\n");
        System.out.println(mbeki.toString());

        return output;
    }
}
