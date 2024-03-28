import java.util.Scanner;

public class p03131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int K = Integer.parseInt(inputArr[0]);
        int A = Integer.parseInt(inputArr[1]);
        int B = Integer.parseInt(inputArr[2]);

        if (B - A <= 2) {
            System.out.println(K + 1);
        } else {
            int firstNumExchanges = A + 1;
            int restNumExchanges = K - firstNumExchanges;
            int gainPerTwoManipulation = B - A;
            int numCookies = restNumExchanges / 2 * gainPerTwoManipulation + B;
            if (restNumExchanges % 2 == 1) {
                numCookies += 1;
            }
            System.out.println(numCookies);
        }
        scanner.close();
    }
}