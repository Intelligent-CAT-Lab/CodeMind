import java.util.Scanner;

public class p03920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int w = 0;
        for (int i = 1; i <= 100000; i++) {
            if (i * (i + 1) / 2 < N && N <= (i + 1) * (i + 2) / 2) {
                w = i + 1;
                break;
            }
        }
        for (int i = w; i >= 1; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }
    }
}

i * (i + 1) / 2 < N <= (i + 1) * (i + 2) / 2
\end{code}. Once `w` is found, it uses another loop to print the values of `i` that satisfy the condition `N >= i`.