import java.util.Scanner;

public class p01473 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int lS = input.length();
        int[] d = new int[lS];
        for (int i = 0; i < lS; i++) {
            d[i] = input.charAt(i) - 'a';
        }
        int dd = 0;
        for (int i = 0; i < lS; i++) {
            if (d[i] % 2 == 0) {
                dd++;
            }
        }
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            int dnm = 1;
            for (int i = 0; i < lS; i++) {
                dnm *= factorial(d[i] / 2);
            }
            System.out.println(factorial(lS / 2) / dnm);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}


Next, it calculates the number of even digits in the string by iterating over the array `d` and checking if each element is even. If the number of even digits is not equal to the number of odd digits, it prints 0 and exits.

Otherwise, it calculates the factorial of each element in the array `d` and stores the result in the variable `dnm`. Finally, it prints the result of dividing the factorial of the length of the string by `dnm`.