import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
    }
}