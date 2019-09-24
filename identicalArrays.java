import java.util.Scanner;

public class identicalArrays {
    public static void main(String[] args) {

        //array 1 input
        Scanner input = new Scanner(System.in);
        int num = 10;
        int arr1[] = new int[num];
        int i;

        //allow user  input

        for (i = 0; i < arr1.length; i++) {
            System.out.println("enter numbers separated by a space, press enter when complete: ");
            arr1[i] = input.nextInt();


            //array 2 input
            Scanner input2 = new Scanner(System.in);
            int arr2[] = new int[num];

            //allow user input
            System.out.println("enter numbers separated by a space, press enter when complete: ");
            arr2[i] = input2.nextInt();


            //check if arr1 == arr2
            boolean equalOrNot = true;

            if (arr1.length == arr2.length) {
                if (arr1[i] != arr2[i]) {
                    equalOrNot = false;
                }

                if (equalOrNot) {
                    System.out.println("Two Arrays Are Equal");
                } else {
                    System.out.println("Two Arrays Are Not equal");
                }


            }
        }

    }
}