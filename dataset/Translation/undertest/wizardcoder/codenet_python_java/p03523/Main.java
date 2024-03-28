import java.util.*;

public class p03523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            List<Integer> L = new ArrayList<>();
            String s = "*".join(s.equals("A")? "*" : s for s in S);
            for (String t : s.split("\\*")) {
                L.add(t.length());
            }
            List<Integer> X = Arrays.asList(1, 0, 0, 1, 1, 1, 1);
            b &= L.stream().allMatch(i -> i <= X.get(L.indexOf(i)));
        }
        System.out.println("YNEOS".charAt(b? 0 : 1));
    }
}