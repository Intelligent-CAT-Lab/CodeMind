<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 6

Expected output:
2


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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    if N > M:
        print(M//2)
        return
    if N == 1 and M ==1:
        print(0)
        return
    if N == 2 and M ==1:
        print(0)
        return
    if N * 2 > M:
        print(M//2)
        return
    ans = N + ((M - N * 2) // 4)
    print(ans)

if __name__ == '__main__':
    main()

```
<|endoftext|>
