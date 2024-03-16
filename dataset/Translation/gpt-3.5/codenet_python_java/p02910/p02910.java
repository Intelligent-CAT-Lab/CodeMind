import java.util.Scanner;

public class p02910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] odd = {'R', 'U', 'D'};
        char[] even = {'L', 'U', 'D'};

        for (int i=0; i<s.length(); i+=2) {
            if (!containsChar(odd, s.charAt(i))) {
                System.out.println("No");
                return;
            }
        }

        for (int j=1; j<s.length(); j+=2) {
            if (!containsChar(even, s.charAt(j))) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    static boolean containsChar(char[] arr, char target) {
        for (char c: arr) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}