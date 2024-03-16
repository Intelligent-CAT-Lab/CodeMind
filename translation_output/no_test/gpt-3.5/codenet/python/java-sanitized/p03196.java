import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p03196 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        List<int[]> factorization = factorization(p);
        int ans = 1;
        for (int i = 0; i < factorization.size(); i++) {
            if (factorization.get(i)[1] >= n) {
                ans *= Math.pow(factorization.get(i)[0], factorization.get(i)[1] / n);
            }
        }
        System.out.println(ans);
    }

    public static List<int[]> factorization(int n) {
        List<int[]> result = new ArrayList<>();
        int temp = n;

        for (int i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                result.add(new int[]{i, cnt});
            }
        }

        if (temp != 1) {
            result.add(new int[]{temp, 1});
        }

        if (result.isEmpty()) {
            result.add(new int[]{n, 1});
        }

        return result;
    }
}