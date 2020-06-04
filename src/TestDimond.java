public class TestDimond {

    public static void main(String[] args) {

        process(4);
    }

    public static void process(int size) {

        // TODO -- add your code here
        int i, j, count = 1;
        deco(size);

        for (i = 0; i < (size * 2 - 1); i++) {            // This loop is for printing the number of rows.
            System.out.print("|");
            if (i == size - 1 && size % 2 == 0) {
                centerLines(size,'-');
            } else if (i == size - 1 && size % 2 == 1) {
                centerLines(size,'=');
            } else {

                if (i < size) {
                    space(size, i);
                    System.out.print("/");
                    for (j = 0; j < i * 2; j++) {
                        equalOrdash(i);

                    }
                    System.out.print("\\");
                    space(size, i);
                }

                if (i >= size) {                          // For printing the lower part of the art.
                    space(size, i);
                    System.out.print("\\");
                    for (j = 0; j < (size - 1) * 2 - (count * 2); j++) {
                        equalOrdash(i);

                    }
                    count++;
                    System.out.print("/");
                    space(size, i);
                }

            }

            System.out.print("|\n");
        }
        deco(size);
    }

    // This method will print upper or bottom lines when called.
    public static void deco(int size) {
        System.out.print("+");
        for (int i = 0; i < size * 2; i++) {
            System.out.print("-");
        }
        System.out.print("+\n");
    }

    // This method will print the space before or after the art.
    public static void space(int size, int i) {
        for (int j = 0; j < Math.abs(size - (i + 1)); j++) {
            System.out.print(" ");
        }
    }
    // This method will print equal or dash based on even or odd.
    public static void equalOrdash(int i) {
        if (i % 2 == 0)
            System.out.print("=");
        else
            System.out.print("-");
    }
    // This method will print the center line for even or odd.
    public static void centerLines(int size,char M)
    {
        System.out.print("<");
        for (int j = 0; j < (size - 1) * 2; j++) {
            System.out.print(M);
        }
        System.out.print(">");
    }

}


