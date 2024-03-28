import java.util.Scanner;

public class p03086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int ans = 0;
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                length++;
                ans = Math.max(ans, length);
            } else {
                length = 0;
            }
        }

        System.out.println(ans);
    }
}