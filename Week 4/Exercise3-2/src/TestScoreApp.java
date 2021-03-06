import java.text.NumberFormat;
import java.util.Scanner;

public class TestScoreApp {


    public static void main(String[] args)
    {
        // display operational messages
        System.out.println("Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        int maximumScore = 999;
        int minimumScore = 100;
        Scanner sc = new Scanner(System.in);

        // get a series of test scores from the user
        while (testScore != 999)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();

            // accumulate score count and score total
            if (testScore <= 100)
            {
                scoreCount += scoreCount + 1;
                maximumScore = Math.min(maximumScore, testScore);
                scoreTotal += testScore;
                minimumScore = Math.min(minimumScore, testScore);
            }
            else if (testScore != 999)
                System.out.println("Invalid entry, not counted");
        }


        // display the score count, score total, and average score
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(1);

        double averageScore = scoreTotal / scoreCount;
        String message = "\n" +
                "Score count:   " + scoreCount + "\n"
                + "Score total:   " + scoreTotal + "\n"
                + "Average score: " + number.format(averageScore) + "\n"
                + "Minimum score: " + minimumScore + "\n"
                + "Maximum score: " + maximumScore + "\n";
        System.out.println(message);
    }
}