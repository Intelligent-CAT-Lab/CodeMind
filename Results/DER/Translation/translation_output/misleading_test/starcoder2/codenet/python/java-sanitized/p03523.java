import java.util.*;
public class p03523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            List<Integer> L = new ArrayList<>();
            String s = "";
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) != 'A') {
                    s += "*";
                } else {
                    if (!s.equals("")) {
                        L.add(s.length());
                        s = "";
                    }
                }
            }
            if (!s.equals("")) {
                L.add(s.length());
            }
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            b &= L.stream().mapToInt(Integer::intValue).allMatch(i -> i <= X[i]);
        }
        System.out.println("YNEOS"[not b::2]);
    }
}