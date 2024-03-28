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
            int val = (int) Math.pow(arr.get(arr.size() - 1), 2) % m;
            if (!s.contains(val)) {
                arr.add((int) Math.pow(arr.get(arr.size() - 1), 2) % m);
                s.add(arr.get(arr.size() - 1));
            } else {
                h = i;
                r = val;
                break;
            }
        }

        int res = arr.stream().mapToInt(Integer::intValue).sum();

        if (h != -1) {
            List<Integer> newArr = arr.subList(arr.indexOf(r), arr.size());
            int rest = n - (h + 1);
            int c = newArr.size();
            int q = rest / c;
            int ssum = newArr.stream().mapToInt(Integer::intValue).sum() * q;
            int rVal = rest % c;
            for (int i = 0; i < rVal; i++) {
                ssum += newArr.get(i);
            }
            res += ssum;
        }

        System.out.println(res);
    }
}