import java.util.*;
public class p01811 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String gene = "ABC";
        boolean f = true;
        List<String> log = new ArrayList<String>();
        while (s.length() > 3 && f) {
            f = false;
            if (s.substring(0, 3).equals("ABC")) {
                s = s.replace("ABC", "A");
                log.add("A");
                f = true;
            } else if (s.substring(s.length() - 3).equals("ABC")) {
                s = s.replace("ABC", "C");
                log.add("C");
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replace("ABC", "B");
                log.add("B");
                f = true;
            }
        }
        if (!s.equals(gene)) {
            System.out.println("No");
            return;
        }
        int l = log.size();
        for (int i = 0; i < l; i++) {
            s = s.replace(log.get(l - 1 - i), "ABC");
        }
        if (s.equals(gene)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}