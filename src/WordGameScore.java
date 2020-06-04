import java.util.Scanner;

public class WordGameScore {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String word = obj.nextLine();



        int numChars = word.length();


        int numVowels = 0;

        for(int i = 0; i< numChars; i++)
        {
            char ch = word.charAt(i);
            ch = Character.toLowerCase(ch);

            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                numVowels++;
            }
        }

        int pointCount = 0;

        if (numChars >= 4 && numVowels >= (numChars-numVowels))
        {
            pointCount = numChars*4;
        }
        else {
            System.out.println("didn't");
            pointCount = numChars*2;
        }

        System.out.println("You Get "+pointCount+ " Points.");

    }
}
