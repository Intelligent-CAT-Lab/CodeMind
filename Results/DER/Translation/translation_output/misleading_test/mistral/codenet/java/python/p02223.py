<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
2
0
11
79

```
import java.util.Arrays;
import java.util.Scanner;

public class p02223 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		if (N == 1) {
			System.out.println(1);
			System.out.println("0");
		} else if (N == 2) {
			System.out.println(2);
			System.out.println("0");
			System.out.println("11");
		} else {
			System.out.println(N - 1);
			for (int i = 2; i <= N; i++) {
				char[] s = new char[i];
				Arrays.fill(s, '1');
				s[0] = s[i - 1] = '0';
				System.out.println(String.valueOf(s));
			}
		}
	}

}

```
[/INST]
```python
N = int(input())

if N == 1:
    print(1)
    print("0")

elif N == 2:
    print(2)
    print("0")
    print("11")

else:
    print(N - 1)
    for i in range(2, N + 1):
        s = ['1'] * i
        s[0] = s[i - 1] = '0'
        print(''.join(s))
```</s>
