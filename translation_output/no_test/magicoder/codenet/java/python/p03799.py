<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03799 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long ans = 0;


		if (N > M) {
			System.out.println(M/2);
			System.exit(0);
		}

		if (N == 1 && M ==1) {
			System.out.println(0);
			System.exit(0);
		}

		if (N == 2 && M ==1) {
			System.out.println(0);
			System.exit(0);
		}

		if (N * 2 > M) {
			System.out.println(M/2);
			System.exit(0);
		}

		ans = N + ((M - N * 2) / 4);

//		for (;;){
//			if (M - 2 >= (N + 1) * 2) {
//				M = M - 2;
//				N = N + 1;
//			} else {
//				break;
//			}
//		}



		System.out.println(ans);
		sc.close();
	}



}


```

@@ Response
```python
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    ans = 0

    if N > M:
        print(M // 2)
        sys.exit(0)

    if N == 1 and M == 1:
        print(0)
        sys.exit(0)

    if N == 2 and M == 1:
        print(0)
        sys.exit(0)

    if N * 2 > M:
        print(M // 2)
        sys.exit(0)

    ans = N + ((M - N * 2) // 4)

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code you provided. It reads two integers from the standard input, and then performs the same operations as the Java code. The `sys.exit(0)` function is used to exit the program immediately after printing the result. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
