Here's the Python code translated into Java:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long x = scanner.nextLong();
        int m = scanner.nextInt();

        ArrayList<Long> arr = new ArrayList<>();
        HashSet<Long> s = new HashSet<>();
        arr.add(x);
        s.add(x);
        int h = -1;
        long r = 0;

        for (int i = 1; i < n; i++) {
            long val = (arr.get(arr.size() - 1) * arr.get(arr.size() - 1)) % m;
            if (!s.contains(val)) {
                arr.add(val);
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }

        // Calculate the initial sum of the sequence
        long res = arr.stream().mapToLong(Long::longValue).sum();

        if (h != -1) {
            int indexOfR = arr.indexOf(r);
            ArrayList<Long> new_arr = new ArrayList<>(arr.subList(indexOfR, arr.size()));
            long rest = n - h;
            int c = new_arr.size();
            long q = rest / c;
            long ssum = new_arr.stream().mapToLong(Long::longValue).sum() * q;
            int remain = (int)rest % c;

            for (int i = 0; i < remain; i++) {
                ssum += new_arr.get(i);
            }
            res += ssum;
        }

        System.out.println(res);
        scanner.close();
    }
}
```

To test the Java code with the input `6 2 1001`, you simply need to run the program, input the values when prompted, and make sure that the program outputs `1459` as expected.
