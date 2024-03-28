import java.util.*;

public class p02427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < Math.pow(2, n); i++) {
            List<Integer> vs = new ArrayList<>();
            for (int v = 0; v < n; v++) {
                if ((i & (1 << v)) > 0) {
                    vs.add(v);
                }
            }
            System.out.println(i + ":" + String.join(" ", vs.toString()));
        }
    }
}