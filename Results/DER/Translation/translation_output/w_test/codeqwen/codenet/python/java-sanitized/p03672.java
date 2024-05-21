import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        List<Integer> lll = new ArrayList<>();
        for (int i = 1; i < s.length() - 1; i += 2) {
            lll.add(i);
        }
        Collections.reverse(lll);
        for (int i : lll) {
            // closed_i = i + 1
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                System.err.println("debug : false this time");
            }
        }
    }
}