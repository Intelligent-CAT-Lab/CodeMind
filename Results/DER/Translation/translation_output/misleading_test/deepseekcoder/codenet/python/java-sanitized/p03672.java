import java.util.Scanner;

public class p03672 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().strip();
        for (int i = s.length() - 2; i > 0; i -= 2) {
            System.err.println("range: " + i);
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                System.err.println("debug: false this time");
            }
        }
    }
}