import java.util.Scanner;

public class p03150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length(); j++) {
                if (S.substring(0, i) + S.substring(j) == "keyence") {
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        }
        for (int k = 0; k < S.length(); k++) {
            if (S.substring(i, i + 8) == "keyence") {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}