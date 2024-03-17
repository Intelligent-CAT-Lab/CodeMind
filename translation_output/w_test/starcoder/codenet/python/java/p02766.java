<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11 2

Expected output:
4


```
n,k = map(int, input().split())
i = 0

while n//k**i!= 0:
    i += 1

print(i)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i = 0;
        while (n / Math.pow(k, i)!= 0) {
            i++;
        }
        System.out.println(i);
    }
}
```
<|endoftext|>
