<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p03149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N[] = new int[4];
		for (int i = 0; i < 4; i++) {
			N[i] = sc.nextInt();
		}
		boolean ans  = false;
		Arrays.sort(N);
		if (N[0] == 1 && N[1] ==4 && N[2]==7 && N[3]==9) {
			ans = true;
		}
		if (ans) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

```

### Response:
```python
import sys

def main():
    N = [int(sys.stdin.readline()) for _ in range(4)]
    N.sort()
    ans = N[0] == 1 and N[1] == 4 and N[2] == 7 and N[3] == 9
    print("YES" if ans else "NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, sorts them, and checks if they are [1, 4, 7, 9]. If they are, it prints "YES"; otherwise, it prints "NO".
<|EOT|>
