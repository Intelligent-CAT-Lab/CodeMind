import java.util.Scanner;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 0; i <= N; i++) {
            String s = String.valueOf(i);
            if (s.contains("7") && s.contains("5") && s.contains("3")) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}