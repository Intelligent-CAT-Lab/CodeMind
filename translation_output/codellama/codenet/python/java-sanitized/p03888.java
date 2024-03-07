import java.util.Scanner;

public class p03888 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] arrayResult = new String[100][100];
        int r1 = 0;
        int r2 = 0;

        for (int i = 0; i < 100; i++) {
            String[] input = scanner.nextLine().split(" ");
            arrayResult[i] = input;
            if (input.length == 2) {
                r1 = Integer.parseInt(input[0]);
                r2 = Integer.parseInt(input[1]);
            }
        }

        System.out.println(1 / ((r2 + r1) / (r1 * r2)));
    }
}