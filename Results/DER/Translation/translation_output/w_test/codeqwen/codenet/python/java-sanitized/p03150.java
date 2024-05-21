import java.util.Scanner;

public class p03150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length(); j++) {
                String substring = S.substring(i, j + 1);
                if (substring.equals("keyence")) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        for (int i = 0; i < S.length(); i++) {
            String substring = S.substring(i, i + 8);
            if (substring.equals("keyence")) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}