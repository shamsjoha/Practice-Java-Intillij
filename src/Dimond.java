import java.util.Scanner;
public class Dimond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of lines the pyramid will have ");
        int line = scan.nextInt();
        int mid = (line +1)/2;

        for (int i = 1; i<=mid ; i++)
        {
            for (int s = mid-1; s>=i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2)-1 ; j++) {
                if ((i % 2) == 0) {
                    System.out.print("=");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        for (int k =1; k<=mid-1;k++)
        {
            for (int s = 1; s <=k ; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*(mid-k))-1 ; j++) {
                if ((k % 2) == 0) {
                    System.out.print("=");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}

