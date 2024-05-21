import java.util.*;

public class p03523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] split = "".join("*" + (s.equals("A")? "" : s) for s : S.split("")).split("*");
            int[] L = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                L[i] = split[i].length();
            }
            int[] X = {1, 0, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < L.length; i++) {
                b &= L[i] <= X[i];
            }
        }
        System.out.println(b? "YES" : "NO");
    }
}