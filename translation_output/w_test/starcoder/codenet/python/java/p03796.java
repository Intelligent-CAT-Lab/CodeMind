<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
6


```
import math
n=int(input())
print(math.factorial(n)%1000000007)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = (res * i) % 1000000007;
        }
        return res;
    }
}
```
'''
<|endoftext|>
