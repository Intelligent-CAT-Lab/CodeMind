import java.util.Scanner;

public class p02582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = solve(input);
        System.out.println(result);
    }

    private static int solve(String input) {
        int mod = 1000000007;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'R') {
                count++;
            }
        }
        if (count == 0) {
            return 0;
        } else if (count == 1) {
            return 1;
        } else if (count == 2) {
            return 2;
        } else {
            return 3;
        }
    }
}