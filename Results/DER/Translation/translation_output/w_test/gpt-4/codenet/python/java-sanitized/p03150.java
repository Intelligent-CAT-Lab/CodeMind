import java.util.Scanner;

public class p03150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        if(checkForKeyence(S)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean checkForKeyence(String S) {
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j <= S.length(); j++) {
                if ((S.substring(0, i) + S.substring(j)).equals("keyence")) {
                    return true;
                }
            }
        }
        for (int i = 0; i < S.length(); i++) {
            if (i + 8 <= S.length() && S.substring(i, i + 8).equals("keyence")) {
                return true;
            }
        }
        return false;
    }
}