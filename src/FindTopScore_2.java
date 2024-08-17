import java.util.*;

public class FindTopScore_2 {

    public static int[] findTopTwoScores(int[] scores) {

        // WRITE YOUR CODE HERE

          int highest =Integer.MIN_VALUE;

          int secondHighest = Integer.MIN_VALUE;

          for(int score : scores){

                if(score > highest) {

                  secondHighest = highest;

                    highest = score;

             } else if (score > secondHighest && score != highest){

                secondHighest = score;

             }

          }

             return new int[]{highest, secondHighest};


        }


    // DO NOT TOUCH THE CODE BELOW

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Please type in a ")
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();

        }

        sc.close();

        System.out.println(Arrays.toString(findTopTwoScores(arr)));

    }

}