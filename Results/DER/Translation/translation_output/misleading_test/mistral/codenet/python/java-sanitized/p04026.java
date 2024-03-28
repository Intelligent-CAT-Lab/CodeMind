import java.util.Scanner;

public class p04026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = s.length();
        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println(i + 1 + ", " + (i + 2));
                return;
            }
        }
        for (int i = 0; i < len - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                System.out.println(i + 1 + ", " + (i + 3));
                return;
            }
        }
        System.out.println(-1, -1);
    }
}