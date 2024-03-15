import java.util.*;

public class p03672 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().strip();
        List<Integer> lll = new ArrayList<>(Arrays.asList(range(1, s.length() - 1, -2)));
        for (int i : lll) {
            System.out.print("range: ");
            System.out.println(lll);
            // closed_i = i + 1
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                System.out.print("debug: ");
                System.out.println("false this time");
            }
        }
    }
}