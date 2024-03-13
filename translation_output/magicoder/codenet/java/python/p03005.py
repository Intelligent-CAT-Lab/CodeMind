<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
    n = int(sys.stdin.readline())
    k = int(sys.stdin.readline())

    if k == 1:
        ans = 0
    else:
        ans = n - k

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, and then calculates the difference between them if the second integer is not equal to 1. Otherwise, it sets the answer to 0. The result is then printed to the standard output.<｜end▁of▁sentence｜>
