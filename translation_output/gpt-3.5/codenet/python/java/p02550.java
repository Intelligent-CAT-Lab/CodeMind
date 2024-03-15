```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int m = input.nextInt();

        List<Integer> arr = new ArrayList<>();
        arr.add(x);
        Set<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1;
        int r = 0;

        for (int i = 0; i < n - 1; i++) {
            int val = (int) Math.pow(arr.get(arr.size() - 1), 2) % m;
            if (!s.contains(val)) {
                arr.add(val);
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }

        int res = arr.stream().mapToInt(Integer::intValue).sum();

        if (h != -1) {
            List<Integer> new_arr = arr.subList(arr.indexOf(r), arr.size());
            int rest = n - (h + 1);
            int c = new_arr.size();
            int q = rest / c;
            int ssum = new_arr.stream().mapToInt(Integer::intValue).sum() * q;
            int remainder = rest % c;

            for (int i = 0; i < remainder; i++) {
                ssum += new_arr.get(i);
            }

            res += ssum;
        }

        System.out.println(res);
    }
}
```
