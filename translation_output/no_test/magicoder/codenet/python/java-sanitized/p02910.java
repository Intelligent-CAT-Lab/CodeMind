import java.util.Scanner;

public class p02910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] odd = {"R", "U", "D"};
        String[] even = {"L", "U", "D"};

        for (int i = 0; i < s.length(); i += 2) {
            boolean found = false;
            for (String str : odd) {
                if (str.equals(String.valueOf(s.charAt(i)))) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            boolean found = false;
            for (String str : even) {
                if (str.equals(String.valueOf(s.charAt(j)))) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}