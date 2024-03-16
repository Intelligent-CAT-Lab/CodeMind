<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

N, K = map(int, sys.stdin.readline().split())
ans = 0
for i in range(N - 1):
    ans = K * (ans // (K - 1)) + ans % (K - 1) + 1
print(ans)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from a string to an integer, and the `range` function is used to iterate over the values of `i` from 0 to `N - 1`. The `//` operator is used for integer division, and the `%` operator is used for modulo division. The `print` function is used to output the final result.</s>
