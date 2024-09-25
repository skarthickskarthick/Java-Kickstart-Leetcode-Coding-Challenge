// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class pattern {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i <= n; i++) {

            for (int k = 0; k < n - i; k++)
                System.out.print(" ");
            for (int j = i; j >= 1; j--)
                System.out.print(j);
            for (int j = 2; j <= i; j++)
                System.out.print(j);
            System.out.println();

        }

    }
}