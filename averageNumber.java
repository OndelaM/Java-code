import java.util.Scanner;

public class averageNumber
{
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int total = 0;
        int count = 0;
        int average;

        System.out.println("Enter a positive or negative integer: ");
        int number;

        while ((number = input.nextInt()) != 0) {
            total += number;
            count++;
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
        }
        average = total / count;
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is: " + average);

    }
}
