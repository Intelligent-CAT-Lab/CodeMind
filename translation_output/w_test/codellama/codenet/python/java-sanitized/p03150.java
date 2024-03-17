import java.util.Scanner;

public class p03150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length() + 1; j++) {
                if (S.substring(0, i) + S.substring(j) == "keyence") {
                    System.out.println("YES");
                    return;
                }
            }
        }
        for (int k = 0; k < S.length(); k++) {
            if (S.substring(k, k + 8) == "keyence") {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}