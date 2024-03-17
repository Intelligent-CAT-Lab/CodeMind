import java.util.*;

public class p01542 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = -1;
        String[] sa = sc.nextLine().split("\\.");
        String ca = "01+-*()";
        Map<String, Integer> fm = new HashMap<>();

        for (int i = 0; i < sa.length; i++) {
            String t = sa[i];
            for (int j = 0; j < ca.length(); j++) {
                String ci = ca.substring(j, j + 1);
                String ts = t + ci;
                int tr = f(ts);
                if (tr != -1) {
                    tr = Integer.parseInt(tr, 2);
                    if (tr >= 1024 || tr < 0) {
                        tr = -1;
                    }
                }
                if (r < tr) {
                    r = tr;
                }
            }
        }

        System.out.println(r);
    }

    public static String f(String s) {
        String ca = "01+-*()";
        String[] sa = s.split("\\.");
        int sl = sa.length;

        Map<String, Integer> fm = new HashMap<>();