import java.util.Scanner;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        int i;
        int k = 360;
        int j = 1;
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.err.println("Invalid input");
        }

        i = Integer.parseInt(sc.nextLine());

        if (1 <= i and i <= 179) {
            while ((i * j) % k!= 0):
                j += 1;
            System.out.println(j);
        } else {
            System.out.println("Invalid input");
        }
    }
}


- In Python, we use `:` instead of `;` to indicate the end of a while loop.
- In Python, we use `and` instead of `&&` to combine conditions.
- In Python, we use `+=` instead of `++` to increment a variable.