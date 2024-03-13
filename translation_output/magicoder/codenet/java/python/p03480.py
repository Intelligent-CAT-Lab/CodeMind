<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		s += '2';
		int n = s.length(), ans = n - 1;
		for(int i = 0; i < n - 1; ++i) {
			if(s.charAt(i) != s.charAt(i + 1)) {
				int tmp = Math.max(i + 1,  n - i - 2);
				ans = Math.min(ans,  tmp);
			}
		}
		System.out.println(ans);
	}

}

```

@@ Response
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    s += '2'
    n = len(s)
    ans = n - 1
    for i in range(n - 1):
        if s[i] != s[i + 1]:
            tmp = max(i + 1, n - i - 2)
            ans = min(ans, tmp)
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, appends '2' to it, calculates the length of the string, and initializes `ans` to be the length of the string minus 1. Then it iterates over the string, checking if the current character is not the same as the next one. If it is, it calculates the maximum of the index of the current character plus 1 and the length of the string minus the index of the current character minus 2, and updates `ans` to be the minimum of `ans` and the calculated value. Finally, it prints the value of `ans`.<｜end▁of▁sentence｜>
