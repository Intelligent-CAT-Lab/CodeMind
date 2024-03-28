<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    a = int(input())
    b = int(input())
    k = int(input())
    set_ = set()
    cnt = 0
    for i in range(a, b+1):
        if cnt >= k:
            break
        cnt += 1
        set_.add(i)
    cnt = 0
    for i in range(b, a-1, -1):
        if cnt >= k:
            break
        cnt += 1
        set_.add(i)
    for ans in sorted(set_):
        print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, adds the first `k` integers in ascending order and the last `k` integers in descending order to a set, sorts the set and prints the elements of the set.
<|EOT|>
