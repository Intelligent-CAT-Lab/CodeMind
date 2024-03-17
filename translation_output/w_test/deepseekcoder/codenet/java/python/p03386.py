<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8 2

Expected output:
3
4
7
8


```


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p03386 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int k = scanner.nextInt();
		Set<Integer> set = new TreeSet<>();
		int cnt = 0;
		for (int i = a; i <= b; i++) {
			if (cnt >= k) {
				break;
			}
			cnt++;
			set.add(i);
		}
		cnt = 0;
		for (int i = b; i >= a; i--) {
			if (cnt >= k) {
				break;
			}
			cnt++;
			set.add(i);
		}
		
		for (Integer ans : set) {
			System.out.println(ans);
		}
		scanner.close();

	}

}

```

### Response:
```python
import sys

def solve(a, b, k):
    nums = set()
    for i in range(a, b+1):
        if len(nums) >= k:
            break
        nums.add(i)
    for i in range(b, a-1, -1):
        if len(nums) >= k:
            break
        nums.add(i)
    for num in sorted(nums):
        print(num)

def main():
    a, b, k = map(int, sys.stdin.readline().split())
    solve(a, b, k)

if __name__ == "__main__":
    main()
```

In this Python code, we first define a function `solve` that takes three parameters: `a`, `b`, and `k`. This function creates a set `nums` to store the numbers. It then iterates over the range from `a` to `b` and `b` to `a` in both directions, adding each number to `nums`. The loop breaks when `nums` contains `k` numbers. Finally, it prints out the numbers in ascending order.

The `main` function reads the input from the standard input, converts it to integers, and calls `solve` with these parameters.

The `if __name__ == "__main__":` line ensures that `main` is only called when the script is run directly, not when it's imported as a module.
<|EOT|>
