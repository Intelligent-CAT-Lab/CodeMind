import java.util.Scanner;

public class p02910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] odd = {"R", "U", "D"};
        String[] even = {"L", "U", "D"};

        for (int i = 0; i < s.length(); i += 2) {
            if (!contains(odd, s.substring(i, i + 1))) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!contains(even, s.substring(j, j + 1))) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    public static boolean contains(String[] arr, String str) {
        for (String s : arr) {
            if (s.equals(str)) {
                return true;
            }
        }
        return false;
    }
}