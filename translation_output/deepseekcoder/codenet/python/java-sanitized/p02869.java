import java.util.Scanner;
import java.lang.Math;

public class p02869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        if ((2*N)*(K+ K+2*N-1) > N*(K+2*N + K+3*N-1)) {
            System.out.println(-1);
            System.exit(0);
        }
        int[] flag = new int[2*N];
        for (int i = 0; i < 2*N; i++) {
            flag[i] = 1;
        }
        for (int i = (int)Math.floor(N/2); i < N; i++) {
            int a = K + i;
            int b = K + 2*N -1 -(i-(int)Math.floor(N/2))*2;
            int c = K + 3*N -1 -(i-(int)Math.floor(N/2));
            System.out.println(a + " " + b + " " + c);
        }
        for (int i = 0; i < (int)Math.floor(N/2); i++) {
            int a = K + i;
            int b = K + 2*N -2 -i*2;
            int c = K + 3*N -1 -i-(int)Math.ceil(N/2);
            System.out.println(a + " " + b + " " + c);
        }
    }
}