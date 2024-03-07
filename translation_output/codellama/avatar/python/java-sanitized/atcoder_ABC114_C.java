import java.util.Scanner;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(aaa(N));
    }

    public static int aaa(int n) {
        if (n > N) {
            return 0;
        }
        int ans = 1;
        for (int i = 0; i < 3; i++) {
            ans += aaa(n + i);
        }
        return ans;
    }
}