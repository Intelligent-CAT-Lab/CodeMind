import java.util.Scanner;

public class p03150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length() + 1; j++) {
                if (S.substring(0, i) + S.substring(j) == "keyence") {
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        }
        for (int i = 0; i < S.length(); i++) {
            if (S.substring(i, i + 8) == "keyence") {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}