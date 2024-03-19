<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 7 9 4

Expected output:
YE:

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
    N = list(map(int, sys.stdin.readline().split()))
    N.sort()
    if N == [1, 4, 7, 9]:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. The `sort()` function is used to sort the list in ascending order. Finally, we check if the sorted list is equal to `[1, 4, 7, 9]` and print "YES" if it is, otherwise we print "NO".
<|EOT|>
