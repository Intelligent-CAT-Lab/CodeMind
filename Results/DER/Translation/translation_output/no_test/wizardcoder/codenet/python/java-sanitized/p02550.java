import java.util.*;

public class p02550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        arr.add(x);
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            int val = arr.get(arr.size() - 1) * arr.get(arr.size() - 1) % m;
            if (!s.contains(val)) {
                arr.add(val);
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }

        int res = 0;
        for (int i : arr) {
            res += i;
        }

        if (h!= -1) {
            List<Integer> new_arr = arr.subList(arr.indexOf(r), arr.size());
            int rest = n - (h + 1);
            int c = new_arr.size();
            int q = rest / c;
            int ssum = 0;
            for (int i : new_arr) {
                ssum += i;
            }
            ssum *= q;
            r = rest % c;
            for (int i = 0; i < r; i++) {
                ssum += new_arr.get(i);
            }
            res += ssum;
        }

        System.out.println(res);
    }
}