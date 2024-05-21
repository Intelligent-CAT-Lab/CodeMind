import java.util.Scanner;

public class p02910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] odd = {"R", "U", "D"};
        String[] even = {"L", "U", "D"};

        for (int i = 0; i < s.length(); i += 2) {
            if (!isInArray(odd, s.charAt(i))) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!isInArray(even, s.charAt(j))) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    private static boolean isInArray(String[] array, char value) {
        for (String item : array) {
            if (item.charAt(0) == value) {
                return true;
            }
        }
        return false;
    }
}