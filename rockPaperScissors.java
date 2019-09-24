import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors

{
    public static void main(String[] args) {

    //start of the class}

            int Scissors = 0;
            int Rock = 1;
            int Paper = 2;
            int u = 0; //user
            int c = 0; //computer

            Scanner myScan = new Scanner(System.in);
            Random myRand = new Random();

            System.out.println("Choose a number between (0/1/2)");

            u = myScan.nextInt();
            c = myRand.nextInt();

            if (u == c) { //Draw

                System.out.println("It's a draw!");

            }else if ((u == Rock && c == Scissors) || (u == Paper && c == Rock) || (u == Scissors && c == Paper)) {// win

                System.out.println("You won!");

            }else //lose
                System.out.println("You lost!");
        }
    }

