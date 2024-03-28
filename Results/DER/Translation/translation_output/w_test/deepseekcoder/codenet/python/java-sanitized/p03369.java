import java.util.Scanner;

public class p03369 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'o') {
                count++;
            }
        }
        System.out.println(700 + 100 * count);
    }
}