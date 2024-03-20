Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5 4

Expected output:
-14

```
A, B, C = list(map(int, input().split()))

a = sorted([A, B, C])
s = 0

for i in range(0, 2):
    tmp = a[2] - a[i]
    
    s += tmp // 2
    a[i] += tmp // 2 * 2

s += sum(a) % 3

print(s)
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        List<Integer> a = new ArrayList<>(Arrays.asList(A, B, C));
        Collections.sort(a);

        int s = 0;

        for (int i = 0; i < 2; i++) {
            int tmp = a.get(2) - a.get(i);
            s += tmp / 2;
            a.set(i, a.get(i) + tmp / 2 * 2);
        }

        s += sum(a) % 3;

        System.out.println(s);
    }

    public static int sum(List<Integer> a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
```<|endoftext|>
