import java.util.*;

public class p02149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> S = new ArrayList<>();
        while (sc.hasNextInt()) {
            S.add(sc.nextInt());
        }
        int maxIndex = S.indexOf(Collections.max(S));
        if (maxIndex == 0) {
            System.out.println("A");
        } else if (maxIndex == 1) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}