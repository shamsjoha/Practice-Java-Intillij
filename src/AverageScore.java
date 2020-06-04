import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        process(input);
        // System.out.println(input);
    }

    public static void process(String input) {
        String[] values = input.split(" ");    // This line creates a string array named 'values' and uses .split
        // Now we will create an int array named 'score' of the same size using the .length data field for storing values in int.
        int[] score = new int[values.length];

        // Now convert take and convert each score from string to int using the Integer.parseInt()
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            score[i] = Integer.parseInt(values[i]);
            count += score[i];

        }

        // compute average
        double average = (double) count / values.length;
        System.out.println("The Average was " + average);
        //compare
        for (int i = 0; i < values.length; i++) {
            if (score[i] < average) {
                System.out.println("The Score " + score[i] + " is less than Average");
            }

        }

    }
}
