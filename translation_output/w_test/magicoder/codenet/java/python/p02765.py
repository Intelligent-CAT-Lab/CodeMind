<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    n, r = map(int, sys.stdin.readline().split())
    if n < 10:
        print(r + (10 - n) * 100)
    else:
        print(r)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `map(int, sys.stdin.readline().split())` function splits the input into two integers `n` and `r`. Then, we check if `n` is less than 10. If it is, we print `r` plus `10 - n` times `100`. If `n` is not less than 10, we just print `r`.<｜end▁of▁sentence｜>
