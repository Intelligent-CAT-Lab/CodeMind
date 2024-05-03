Here is the Java version of your Python code:

```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int x = Integer.parseInt(inputs[1]);
        int m = Integer.parseInt(inputs[2]);

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
            List<Integer> newArr = arr.subList(arr.indexOf(r), arr.size());
            int rest = n - (h + 1);
            int c = newArr.size();
            int q = rest / c;
            int ssum = newArr.stream().mapToInt(Integer::intValue).sum() * q;
            r = rest % c;
            for (int i = 0; i < r; i++) {
                ssum += newArr.get(i);
            }
            res += ssum;
        }

        System.out.println(res);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the standard input, creates a list and a set, and then iterates over the list. If the square of the last
