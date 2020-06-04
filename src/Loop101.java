public class Loop101 {
    public static void main(String[] args) {

        for(int i =1 ; i<=5 ; i++)
        {

            for(i =1;i<=2 ; i++)
            {
                System.out.println("Second Loop" + i);

            }
            System.out.println("First loop " + i);
        }
    }
}
