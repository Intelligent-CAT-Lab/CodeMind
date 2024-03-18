import java.util.Scanner;

public class p02004 {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            int result = processInput(input);
            System.out.println(result);
        }
        scanner.close();
    }

    private static int processInput(String input) {
        int count = 0;
        int t = 0;
        for (char c : input.toCharArray()) {
            if (c == 'R') {
                t += 1;
                if (t == 4) {
                    count += 1;
                    t = 0;
                }
            } else {
                t -= 1;
                if (t == -4) {
                    t = 0;
                }
            }
        }
        return count;
    }
}