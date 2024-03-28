import java.util.Scanner;

public class p03150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j <= S.length(); j++) {
                if (S.substring(0, i) + S.substring(j).equals("keyence")) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        // Check every possible contiguous substring of length 7
        for (int k = 0; k <= S.length() - 7; k++) {
            if (S.substring(k, k + 7).equals("keyence")) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}