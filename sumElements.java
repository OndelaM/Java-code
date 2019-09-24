import java.util.*; //Scanner class

public class sumElements
{
    static double[][] mat;

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter rows and columns:");



    int n = input.nextInt();
    int m = input.nextInt();
    mat = new double[n][m];

        for (int i = 0; i < n; i++){

            for (int j = 0; j< m; j++) {
                mat[i][j] = input.nextDouble();
            }

        }

        System.out.println("Enter column to sum");
        double sum = 0;
        int col = input.nextInt();

        for(int i = 0; i <m; i++){
            sum+=mat[i][col];
        }

        System.out.println("Sum of " + col + "In the mat is " + sum);

    }


}