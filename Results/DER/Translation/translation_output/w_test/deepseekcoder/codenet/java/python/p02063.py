<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 6

Expected output:
8


```
import java.util.Scanner;

public class p02063 {
	static long startTime = System.currentTimeMillis();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long A = sc.nextLong();
		long B = sc.nextLong();
		for (long i = B + 1; ; i++) {
			if ((i & 0xFF) == 0 && System.currentTimeMillis() - startTime > 3500) break;
			long ca = i / A + i % A;
			long remb = i % B;
			long cb = i / B + remb / A + remb % A;
			if (ca < cb) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

}


```

### Response:
```python
import time

def main():
    A, B = map(int, input().split())
    start_time = time.time()
    for i in range(B + 1, 10**18):
        if (i & 0xFF) == 0 and time.time() - start_time > 3.5:
            break
        ca = i // A + i % A
        remb = i % B
        cb = i // B + remb // A + remb % A
        if ca < cb:
            print(i)
            return
    print(-1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers A and B from the input, then it iterates over the integers starting from B + 1. For each integer, it calculates two values: ca and cb. If ca is less than cb, it prints the current integer and stops. If no such integer is found after 3.5 seconds, it prints -1.
<|EOT|>
