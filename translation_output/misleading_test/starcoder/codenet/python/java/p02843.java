<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
615

Expected output:
-71

```
N = int(input())
q, mod = divmod(N, 100)
print(1 if mod <= q * 5 else 0)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int q = N / 100;
        int mod = N % 100;
        System.out.println(1 if mod <= q * 5 else 0);
    }
}
```
'''
<|endoftext|>
