import java.util.*;

public class p03672 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().strip();
        for (int i = s.length() - 2; i > 0; i -= 2) {
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            }
        }
    }
}