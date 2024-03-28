import java.util.*;

public class p03672 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().strip();
        List<Integer> lll = new ArrayList<>(Arrays.asList(s.substring(1, s.length() - 1).split("")));
        for (int i = lll.size() - 1; i >= 0; i -= 2) {
            System.out.print("range: ");
            System.out.println(lll.subList(i, i + 2));
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