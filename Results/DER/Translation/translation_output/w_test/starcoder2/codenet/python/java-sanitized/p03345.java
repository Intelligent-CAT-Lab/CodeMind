import java.util.Scanner;

public class p03345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        if (K % 2 == 0) {
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}




import java.util.Scanner;

public class p03345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int len = A[i] + A[j] + A[k];
                    int ma = Math.max(A[i], Math.max(A[j], A[k]));
                    int rest = len - ma;
                    if (ma < rest) {
                        ans = Math.max(ans, len);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

/ABC/ABC160/ABC160_C.md
# C - Traveling Salesman around Lake