import java.util.*;

public class p02550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        arr.add(x);
        Set<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            int val = (arr.get(i) * arr.get(i)) % m;
            if (!s.contains(val)) {
                arr.add(val);
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }

        int res = arr.stream().mapToInt(i -> i).sum();
        if (h!= -1) {
            List<Integer> newArr = arr.subList(h + 1, arr.size());
            int rest = n - (h + 1);
            int c = newArr.size();
            int q = rest / c;
            int ssum = newArr.stream().mapToInt(i -> i).sum() * q;
            int i = 0;
            while (i < rest % c) {
                ssum += newArr.get(i);
                i++;
            }
            res += ssum;
        }

        System.out.println(res);
    }
}