<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

N, M = map(int, input().split())
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

# for (;;){
#     if (M - 2 >= (N + 1) * 2):
#         M = M - 2
#         N = N + 1
#     else:
#         break
# }

print(ans)
```</s>
