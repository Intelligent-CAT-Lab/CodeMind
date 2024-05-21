import java.util.*;

public class p03196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        List<List<Integer>> factorization = factorization(p);
        long ans = 1;
        for (List<Integer> list : factorization) {
            int count = list.get(1);
            if (count >= n) {
                ans *= Math.pow(list.get(0), count / n);
            }
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> factorization(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(Arrays.asList(i, cnt));
            }
        }

        if (temp!= 1) {
            arr.add(Arrays.asList(temp, 1));
        }

        if (arr.isEmpty()) {
            arr.add(Arrays.asList(n, 1));
        }

        return arr;
    }
}