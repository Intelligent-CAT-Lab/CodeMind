import java.util.Scanner;

public class p03567 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == 'B' && S.charAt(i + 1) == 'A') {
                count++;
            }
        }
        if (count >= 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}