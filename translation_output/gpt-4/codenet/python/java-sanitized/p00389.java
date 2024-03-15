import java.util.Scanner;

public class p00389 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int t = 1;
        int n, a = 1;
        
        while (true) {
            n = (K + a - 1) / K;
            a += n;
            if (N < a) {
                break;
            }
            t += 1;
        }
        System.out.println(t);
        
        sc.close();
    }
}