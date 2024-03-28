import java.util.Scanner;

public class p02004 {

    public static int countConsecutiveFour(String s) {
        int count = 0;
        int temp = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                temp++;
                if (temp == 4) {
                    count++;
                    temp = 0;
                }
            } else {
                temp--;
                if (temp == -4) {
                    temp = 0;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if ("0".equals(input)) {
                break;
            }
            System.out.println(countConsecutiveFour(input));
            // If we only expect a single input, we can break here unconditionally
            // break;
        }
        scanner.close();
    }
}