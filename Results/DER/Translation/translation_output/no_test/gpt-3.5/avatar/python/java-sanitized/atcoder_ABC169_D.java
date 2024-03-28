import java.util.ArrayList;
import java.util.Collections;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        int x = Integer.parseInt(System.console().readLine());
        ArrayList<ArrayList<Integer>> l = factorization(x);
        Collections.sort(l);
        int ans = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).get(0) == 1) {
                continue;
            } else {
                int s = 0;
                int num = l.get(i).get(1);
                int j;
                if (num == 1) {
                    j = 1;
                } else {
                    for (j = 1; j < num; j++) {
                        s += j;
                        if (s == num) {
                            break;
                        } else if (s > num) {
                            j -= 1;
                            break;
                        }
                    }
                }
                ans += j;
            }
        }
        System.out.println(ans);
    }

    public static ArrayList<ArrayList<Integer>> factorization(int n) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int temp = n;
        for (int i = 2; i < Math.ceil(Math.sqrt(n)) + 1; i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt += 1;
                    temp /= i;
                }
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(cnt);
                arr.add(pair);
            }
        }
        if (temp != 1) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(temp);
            pair.add(1);
            arr.add(pair);
        }
        if (arr.isEmpty()) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(n);
            pair.add(1);
            arr.add(pair);
        }
        return arr;
    }
}