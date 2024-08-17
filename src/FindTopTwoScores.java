public class FindTopTwoScores {
    
    
    public static void main(String[] args) {
        // Example input arrays
        int[] scores1 = {86, 92, 78, 96, 90};
        int[] scores2 = {70, 85, 90, 75, 80};

        // Find and print the two highest scores
        int[] topTwoScores1 = findTwoHighestScores(scores1);
        int[] topTwoScores2 = findTwoHighestScores(scores2);

        System.out.println("Top two scores in array 1: " + topTwoScores1[0] + ", " + topTwoScores1[1]);
        System.out.println("Top two scores in array 2: " + topTwoScores2[0] + ", " + topTwoScores2[1]);
    }

    public static int[] findTwoHighestScores(int[] scores) {
        if (scores == null || scores.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : scores) {
            if (score > highest) {
                secondHighest = highest;
                highest = score;
            } else if (score > secondHighest && score != highest) {
                secondHighest = score;
            }
        }

        return new int[]{highest, secondHighest};
    }

}
