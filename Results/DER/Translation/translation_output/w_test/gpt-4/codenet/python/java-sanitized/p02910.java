import java.util.Scanner;

public class p02910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

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

    private static boolean contains(String[] array, String value) {
        for (String element : array) {
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }
}