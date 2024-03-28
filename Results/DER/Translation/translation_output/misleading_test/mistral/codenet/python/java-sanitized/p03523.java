import java.util.*;

public class p03523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            List<Integer> L = new ArrayList<>();
            for (char c : S.toCharArray()) {
                if (c != 'A') {
                    L.add(1);
                } else {
                    L.add(0);
                }
            }
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            boolean c = true;
            for (int i = 0; i < L.size(); i++) {
                c &= L.get(i) <= X[i];
            }
            System.out.println("spC".charAt(not b::2));
        }
    }
}