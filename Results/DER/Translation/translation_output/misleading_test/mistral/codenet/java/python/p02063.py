<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 6

Expected output:
3

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
[/INST]
```python
import time

def main():
    A = int(input())
    B = int(input())
    start_time = time.time()
    for i in range(B+1, -1, -1):
        ca = i // A + i % A
        remb = i % B
        cb = i // B + remb // A + remb % A
        if ca < cb:
            print(i)
            return
    print(-1)

if __name__ == "__main__":
    main()
```</s>
