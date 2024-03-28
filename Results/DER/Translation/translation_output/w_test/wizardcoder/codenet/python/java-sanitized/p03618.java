import java.util.*;

public class p03618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("a", "");
        s = s.replaceAll("t", "");
        s = s.replaceAll("c", "");
        s = s.replaceAll("g", "");
        s = s.replaceAll("A", "");
        s = s.replaceAll("T", "");
        s = s.replaceAll("C", "");
        s = s.replaceAll("G", "");
        s = s.replaceAll("\\s", "");
        s = s.toLowerCase();
        int n = s.length();
        int res = n * (n - 1) / 2 + 1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == c) {
                    count++;
                }
            }
            res -= count * (count - 1) / 2;
        }
        System.out.println(res);
    }
}