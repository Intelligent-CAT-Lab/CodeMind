<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 7 9 4

Expected output:
YES


```
import java.util.Arrays;
import java.util.Scanner;

public class p03149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N[] = new int[4];
		for (int i = 0; i < 4; i++) {
			N[i] = sc.nextInt();
		}
		boolean ans  = false;
		Arrays.sort(N);
		if (N[0] == 1 && N[1] ==4 && N[2]==7 && N[3]==9) {
			ans = true;
		}
		if (ans) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

```
[/INST]
```
import sys

def main():
    N = list(map(int, sys.stdin.readline().split()))
    N.sort()
    if N == [1, 4, 7, 9]:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the input string to a list of integers, and the `sort` function is used to sort the list in ascending order. The `if` statement checks if the sorted list is equal to the expected list `[1, 4, 7, 9]`, and if it is, it prints "YES", otherwise it prints "NO".</s>
