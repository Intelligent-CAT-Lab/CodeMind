<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```python
import sys

N, M = map(int, input().split())

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

ans = N + (M - N * 2) // 4

print(ans)
```
This is the Python code equivalent to the given Java code. The code first takes input from the user and stores it in the variables `N` and `M`. It then checks if `N` is greater than `M`, and if so, it prints `M // 2` and exits the program.

If `N` is not greater than `M`, the code checks if `N` is equal to 1 and `M` is equal to 1, and if so, it prints 0 and exits the program.

If `N` is not equal to 1 and `M` is not equal to 1, the code checks if `N` is equal to 2 and `M` is equal to 1, and if so, it prints 0 and exits the program.

If `N` is not equal to 2 and `M` is not equal to 1, the code checks if `N` times 2 is greater than `M`, and if so, it prints `M // 2` and exits the program.

If `N` times 2 is not greater than `M`, the code calculates the value of `ans` as `N + (M - N * 2) // 4`, and then prints `ans`.

Finally, the code exits the program.</s>
