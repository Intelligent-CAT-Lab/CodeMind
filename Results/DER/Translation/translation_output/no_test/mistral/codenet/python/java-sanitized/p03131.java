import java.util.Scanner;

public class p03131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K, A, B;
        String[] input = scanner.nextLine().split(" ");
        K = Integer.parseInt(input[0]);
        A = Integer.parseInt(input[1]);
        B = Integer.parseInt(input[2]);

        if (B - A <= 2) {
            System.out.println(K + 1);
        } else {
            int firstNumExchanges = A + 1;
            int restNumExchanges = K - firstNumExchanges;
            int gainPerTwoManipulation = B - A;
            int numCookies = restNumExchanges / 2 * gainPerTwoManipulation + B;
            if (restNumExchanges % 2 == 1) {
                numCookies++;
            }
            System.out.println(numCookies);
        }
    }
}