<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    N = list(map(int, sys.stdin.readline().split()))
    ans = False
    N.sort()
    if N == [1, 4, 7, 9]:
        ans = True
    if ans:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the console. The `split()` function is used to split the input into a list of integers. The `sort()` function is used to sort the list in ascending order. If the sorted list is equal to the list [1, 4, 7, 9], then `ans` is set to `True`. If `ans` is `True`, "YES" is printed; otherwise, "NO" is printed.<｜end▁of▁sentence｜>
