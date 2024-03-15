Here is the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (a % i == 0 && b % i == 0) {
                res.add(i);
            }
        }
        
        Collections.sort(res, Collections.reverseOrder());
        System.out.println(res.get(k - 1));
        
        scanner.close();
    }
}
```

This Java program takes three integers (`a`, `b`, and `k`) as input and outputs the k-th largest common divisor of `a` and `b`. Remember that Java is strictly typed, so you need to declare the type of each variable before using it. Additionally, input reading is handled by a `Scanner` object and the list of common divisors is an `ArrayList`. Lastly, sorting in descending order is done using `Collections.sort()` with `Collections.reverseOrder()` as the comparator.
