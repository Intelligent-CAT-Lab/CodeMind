import java.util.*;

public class p03687 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        char[] chars = S.toCharArray();
        ArrayList<Integer> o = new ArrayList<>();
        for (char a = 'a'; a <= 'z'; a++) {
            int j = 0;
            int m = 0;
            for (char b : chars) {
                if (a == b) {
                    j = 0;
                } else {
                    j++;
                    m = Math.max(m, j);
                }
            }
            o.add(m);
        }
        int min = o.get(0);
        for (int i : o) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}