import java.util.Scanner;

public class p03150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j <= S.length(); j++) {
                if ((S.substring(0, i) + S.substring(j)).equals("keyence")) {
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        }
        for (int k = 0; k < S.length(); k++) {
            if (S.substring(k, S.length()).equals("keyence")) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}