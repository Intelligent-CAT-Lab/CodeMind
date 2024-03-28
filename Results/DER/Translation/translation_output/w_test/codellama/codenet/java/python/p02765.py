<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2919

Expected output:
3719


```
import java.util.*;

public class p02765 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n < 10){
            System.out.println(r+ (10 - n) * 100);
        
        }else{
            System.out.println(r);
        }
    }
}

```
[/INST]
```
import sys

n, r = map(int, sys.stdin.readline().split())

if n < 10:
    print(r + (10 - n) * 100)
else:
    print(r)
```
This code reads the input from stdin, splits it into two integers `n` and `r`, and then checks if `n` is less than 10. If it is, it calculates the output as `r + (10 - n) * 100`, otherwise it simply prints `r`. The output is then printed to stdout.</s>
