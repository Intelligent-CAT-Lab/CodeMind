import java.util.*;

public class p03523 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] L = "".join("*" if s!="A" else s for s in S).split("*");
            List<Integer> X = Arrays.asList(1,0,0,1,1,1,1);
            b &= L.stream().allMatch(s -> X.get(L.indexOf(s)) >= s.length());
        }
        System.out.println(b ? "YES" : "NO");
    }
}