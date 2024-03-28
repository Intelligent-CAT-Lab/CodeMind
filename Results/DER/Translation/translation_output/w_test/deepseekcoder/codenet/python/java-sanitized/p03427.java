import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            int num = Integer.parseInt(String.valueOf(n.charAt(i)));
            if (i == 0) {
                max = num - 1 + 9 * (n.length() - 1);
            } else {
                max += num;
            }
        }
        System.out.println(max);
    }
}