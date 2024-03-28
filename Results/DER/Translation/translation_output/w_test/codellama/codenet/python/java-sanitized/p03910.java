import java.util.Scanner;

public class p03910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int S = 0;
        for (int i = 1; i <= N; i++) {
            if (S >= N) {
                break;
            }
            S += i;
            A[i - 1] = i;
        }
        int x = 0;
        for (int a : A) {
            if (x == a) {
                continue;
            }
            System.out.println(a);
        }
    }
}


Next, it iterates over the array `A` again and checks if the sum of the numbers in the array is greater than or equal to `N`. If it is, it breaks out of the loop.