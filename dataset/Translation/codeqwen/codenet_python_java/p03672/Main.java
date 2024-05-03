import java.util.*;
import java.lang.*;

public class p03672 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        List<Integer> lll = new ArrayList<>();
        for (int i = s.length() - 2; i > 0; i -= 2) {
            lll.add(i);
        }
        Collections.reverse(lll);
        for (int i : lll) {
            System.err.print("range: ");
            System.err.println(lll);
            // int closed_i = i + 1;
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                System.err.print("debug: ");
                System.err.println("false this time");
            }
        }
    }
}