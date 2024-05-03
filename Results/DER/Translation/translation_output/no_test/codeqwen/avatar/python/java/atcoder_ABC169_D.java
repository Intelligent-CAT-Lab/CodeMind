Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(System.console().readLine());
        List<List<Integer>> l = factorization(x);
        Collections.sort(l);
        int ans = 0;
        for (List<Integer> pair : l) {
            if (pair.get(0) == 1) {
                continue;
            } else {
                int s = 0;
                int num = pair.get(1);
                if (num == 1) {
                    int j = 1;
                } else {
                    for (int j = 1; j < num; j++) {
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

    public static List<List<Integer>> factorization(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt += 1;
                    temp /= i;
                }
                arr.add(new ArrayList<>(List.of(i, cnt)));
            }
        }
        if (temp != 1) {
            arr.add(new ArrayList<>(List.of(temp, 1)));
        }
        if (arr.isEmpty()) {
            arr.add(new ArrayList<>(List.of(n, 1)));
        }
        return arr;
    }
}
```


