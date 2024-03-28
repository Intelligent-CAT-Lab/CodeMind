import java.util.Scanner;

public class p02910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] odd = {"R", "U", "D"};
        String[] even = {"L", "U", "D"};

        for (int i = 0; i < s.length(); i += 2) {
            if (!isOdd(s.charAt(i), odd)) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!isEven(s.charAt(j), even)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    private static boolean isOdd(char c, String[] odd) {
        for (String s : odd) {
            if (c == s.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isEven(char c, String[] even) {
        for (String s : even) {
            if (c == s.charAt(0)) {
                return true;
            }
        }
        return false;
    }
}