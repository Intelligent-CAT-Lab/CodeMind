<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * Design of a Mansion
 */
public class p00388 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H, A, B;
		H = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();

		int ans = 0;

		for (int i = A; i <= B; i++) {
			if (H % i == 0) ans++;
		}

		System.out.println(ans);
	}
}


```
[/INST]
```python
import sys

def main():
    H, A, B = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(A, B+1):
        if H % i == 0:
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()
```</s>
