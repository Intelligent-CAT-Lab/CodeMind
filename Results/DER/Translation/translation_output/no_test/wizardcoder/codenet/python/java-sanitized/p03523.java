import java.util.*;

public class p03523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            List<Integer> L = new ArrayList<>();
            String[] arr = "".join("*" + (s!= "A"? s : "") for s in S).split("\\*");
            for (String s : arr) {
                L.add(s.length());
            }
            boolean[] X = {1, 0, 0, 1, 1, 1, 1};
            b &= L.stream().allMatch(i -> i <= X[i]);
        }
        System.out.println("YNEOS"[b? 0 : 1]);
    }
}