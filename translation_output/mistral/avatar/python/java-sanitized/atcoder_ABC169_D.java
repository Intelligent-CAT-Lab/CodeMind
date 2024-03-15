import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        List<int[]> arr = factorization(x);
        Collections.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)[0] == 1) {
                continue;
            } else {
                int s = 0;
                int num = arr.get(i)[1];
                if (num == 1) {
                    s = 1;
                } else {
                    for (int j = 1; j < num; j++) {
                        s += j;
                        if (s == num) {
                            break;
                        } else if (s > num) {
                            j--;
                            break;
                        }
                    }
                }
                ans += s;
            }
        }
        System.out.println(ans);
    }

    public static List<int[]> factorization(int n) {
        List<int[]> arr = new ArrayList<>();
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