import java.util.*;

public class p03392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().strip();
        int l = a.length();
        if (l < 6) {
            Set<String> s = new HashSet<>();
            s.add(a);
            List<String> q = new ArrayList<>();
            int oa = (int) 'a';
            while (!q.isEmpty()) {
                String a1 = q.remove(0);
                for (int i = 0; i < l - 1; i++) {
                    if (a