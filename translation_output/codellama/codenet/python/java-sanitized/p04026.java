import java.util.Scanner;

public class p04026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println(i + 1 + " " + (i + 2));
                break;
            }
            i++;
        }
        i = 0;
        while (i < s.length() - 2) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                System.out.println(i + 1 + " " + (i + 3));
                break;
            }
            i++;
        }
        System.out.println(-1 + " " + -1);
    }
}