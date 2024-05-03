import java.util.ArrayList;
import java.util.Scanner;

public class p03196 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int p = Integer.parseInt(input[1]);

        ArrayList<int[]> l = factorization(p);
        int ans = 1;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i)[1] >= n) {
                ans *= (int) Math.pow(l.get(i)[0], l.get(i)[1] / n);
            }
        }
        System.out.println(ans);
    }

    public static ArrayList<int[]> factorization(int n) {
        ArrayList<int[]> arr = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(new int[]{i, cnt});
            }
        }

        if (temp != 1) {
            arr.add(new int[]{temp, 1});
        }

        if (arr.isEmpty()) {
            arr.add(new int[]{n, 1});
        }

        return arr;
    }
}