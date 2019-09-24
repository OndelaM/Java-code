public class Secretary {
    //Attributes
    String name;
    String surname;
    int age;
    int salary;
    String experience;


    // This is the constructor/method of the class Secretary
    public Secretary (String name, String surname, int age, int salary, String experience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
    }
    Secretary ruth = new Secretary("Ruth", "Golembo", 40, 15000, "5years");
    Secretary rhulani = new Secretary("Rhulani", "Shiyiwe" , 32, 10000, "4years");
    Secretary renny = new Secretary("Renny", "Mboza", 45, 16000, "6years");


    // Assign the age of the Secretary  to the variable age
    public String getName(){
        return name;
    }

    // Assign the surname
    public String getSurname() {
        return surname;
    }

    // Assign the years of experience
    public String getExperience() {
        return experience;
    }


    // Print the Secretary details toString
    public String toString() {
        String output = "Name:"+ name;
        output += "\nSurname:" + surname;
        output += "\nAge:" + age;
        output += "\nSalary:" + salary;
        output += "\nExperience:" + experience;


        System.out.println("Secretary\n");
        System.out.println(ruth.toString()+"\n");
        System.out.println(rhulani.toString()+"\n");
        System.out.println(renny.toString());

        return output;

    }
}
