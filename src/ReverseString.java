import java.util.Scanner;



public class ReverseString {

    public static String reverseString(String input) {

        // WRITE YOUR CODE HERE

          String original = input;

          String reversed ="";

          for(int i = 0; i < original.length(); i++){

              reversed = original.charAt(i) + reversed;

          }

           return reversed;


    }


    // DO NOT MODIFY THE BELOW CODE.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


     System.out.print("-->Enter a String to reverse: ");

        String inputString = scanner.nextLine();


        scanner.close();



        String reversedString = reverseString(inputString);

        System.out.println(reversedString);

    }

}