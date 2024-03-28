<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 3 5

Expected output:
3 0


```
import java.util.Scanner;

public class p03139 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(Math.min(A, B) + " " + Math.max(0, A + B - N));
	}
}
```
[/INST]
```
import math

def main():
    N, A, B = map(int, input().split())
    print(math.min(A, B), math.max(0, A + B - N))

if __name__ == '__main__':
    main()
```
This code uses the `math` module to calculate the minimum and maximum values of `A` and `B`, and the `input()` function to read the input from the user. The `map()` function is used to convert the input string to a list of integers. The `if __name__ == '__main__':` block is used to execute the `main()` function when the script is run directly.</s>
