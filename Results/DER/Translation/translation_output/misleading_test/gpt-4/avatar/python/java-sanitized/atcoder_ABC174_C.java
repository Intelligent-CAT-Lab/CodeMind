import java.util.Scanner;

public class atcoder_ABC174_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int cnt = 0;
        int now = 0;
        
        if (K % 2 == 0) {
            System.out.println(-1);
            return;
        }
        
        for (int i = 0; i < 1000000; i++) {
            cnt++;
            now = (now * 10 + 7) % K;
            if (now == 0) {
                System.out.println(cnt);
                return;
            }
        }
        
        System.out.println(-1);
    }
}