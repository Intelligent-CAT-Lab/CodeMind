import java.util.Scanner;

public class p03150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j <= S.length(); j++) {
                if (S.substring(0, i) + S.substring(j).equals("keyence")) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        for (int i = 0; i < S.length(); i++) {
            if (S.substring(i).equals("keyence")) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}