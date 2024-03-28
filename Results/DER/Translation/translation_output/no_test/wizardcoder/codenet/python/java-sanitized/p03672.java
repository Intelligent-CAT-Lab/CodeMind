import java.util.*;

public class p03672 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int n = s.length();
        List<Integer> lll = new ArrayList<>();
        for (int i = 1; i < n-1; i+=2) {
            lll.add(i);
        }
        Collections.reverse(lll);
        for (int i : lll) {
            System.out.println(i);
            if (s.substring(0, i/2).equals(s.substring(i/2, i))) {
                return;
            }
        }
    }
}