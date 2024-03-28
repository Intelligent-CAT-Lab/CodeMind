import java.util.*;

public class p03648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 50 - b; i++) {
            ans.add(Integer.toString(a + i));
        }
        for (int i = 0; i < b; i++) {
            ans.add(Integer.toString(a + 50 - b + i + 1));
        }
        System.out.println(String.join(" ", ans));
    }
}