Sure, here is the equivalent Java code:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] abc = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] a = Arrays.copyOf(abc, abc.length);
        Arrays.sort(a);
        int s = 0;

        for (int i = 0; i < 2; i++) {
            int tmp = a[2] - a[i];
            
            s += tmp / 2;
            a[i] += (tmp / 2) * 2;
        }

        s += Arrays.stream(a).sum() % 3;

        System.out.println(s);
    }
}
```

This Java code performs the same operations as the given Python code. It reads three integers from the user, sorts them, calculates the steps needed to make all numbers have the same count of modulo 2, then adds the collective modulo 3 values to the steps, and prints the total number of steps (s).
