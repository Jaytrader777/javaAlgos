import java.util.Scanner;

public class OddOrEven {

    public static boolean isEven(int number) {

    // Write your code here

       double numD = number;

       boolean evenNumber;

       if (numD%2==0){


          evenNumber = true;

       } else { 

           evenNumber = false;

       }

        return evenNumber;

    }
  

    // Do not modify the below code


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print(" --> Enter a Number: ");
        int number = scanner.nextInt();

        if (isEven(number)) {

            System.out.println("The number is even.");

        } else {

            System.out.println("The number is odd.");

        }
        
        scanner.close();

    }


}