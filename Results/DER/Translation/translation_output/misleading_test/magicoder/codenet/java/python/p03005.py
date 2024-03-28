<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
34

```
import java.util.*;
public class p03005{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		if(k == 1){
			ans = 0;
		}else{
			ans = n - k;
		}
		
		System.out.println(ans);
	}
}

```

@@ Response
```python
import sys

def main():
    ans = 0
    n, k = map(int, sys.stdin.readline().split())

    if k == 1:
        ans = 0
    else:
        ans = n - k

    print(ans)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `map(int, sys.stdin.readline().split())` function is used to convert the input into integers. The `if` statement checks if `k` is equal to 1, if it is, `ans` is set to 0, otherwise `ans` is set to `n - k`. Finally, the `print(ans)` statement prints the result.<｜end▁of▁sentence｜>
