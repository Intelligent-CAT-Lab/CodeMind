import java.util.Scanner;

public class p03086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ans = 0;
        int length = 0;
        String s = scanner.next();

        for (char c : s.toCharArray()) {
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                length++;
                ans = Math.max(ans, length);
            } else {
                length = 0;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}