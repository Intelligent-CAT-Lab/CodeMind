import java.util.*;

public class p02427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < Math.pow(2, n); i++) {
            List<Integer> vs = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    vs.add(j);
                }
            }
            System.out.println(i + ":" + vs.toString().replaceAll("\\[|\\]|,", ""));
        }
    }
}