<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2

Expected output:
5

```
import java.util.*;

public class p01810{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        long N = sc.nextLong(), K = sc.nextLong();
                        long ans = 0;
                        for(long i = 0; i < N - 1; i++){
                                ans = K * ((long)(ans / (K - 1))) + ans % (K - 1) + 1;
                        }
                        System.out.println(ans);
                }
        }
}
```
[/INST]
```
import sys

N, K = map(int, sys.stdin.readline().split())
ans = 0
for i in range(N - 1):
    ans = K * (ans // (K - 1)) + ans % (K - 1) + 1
print(ans)
```
This code uses the `map` function to convert the input string to a list of integers, and then uses a for loop to iterate over the list and perform the calculation. The `//` operator is used for integer division, and the `%` operator is used for modulo division. The `+` operator is used to add the results of the calculation to the previous value of `ans`. Finally, the result is printed to the console using the `print` function.</s>
