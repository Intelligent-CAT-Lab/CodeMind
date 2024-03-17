<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 900

Expected output:
Yes


```
K, X = list(map(int, input().split()))
print("Yes" if 500*K>=X else "No")

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        System.out.println("Yes" if 500*K>=X else "No");
    }
}
```
<|endoftext|>
