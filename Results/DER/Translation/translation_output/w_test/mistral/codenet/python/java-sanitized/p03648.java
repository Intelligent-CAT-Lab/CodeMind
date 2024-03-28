import java.util.*;

public class p03648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int a = K / 50, b = K % 50;
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 50 - b; i++) {
            ans.add(String.valueOf(a + i));
        }
        for (int i = 0; i < b; i++) {
            ans.add(String.valueOf(a + 50 - b + i + 1));
        }
        System.out.println(ans.stream().mapToInt(Integer::parseInt).sum());
    }
}