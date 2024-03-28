<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12

Expected output:
12: 2 2 3


```
import java.util.Scanner;

//?Â´??????Â°????Â§Â£?????????????????Â°??????
public class p02467 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.nextLine());
		System.out.print(n + ":");
		for (int i = 2; n >= i * i;) {
			if (n % i == 0) {
				n = n / i;
				System.out.print(" " + i);
			} else {
				i++;
			}
		}
		System.out.println(" " + n);
	}

}
```
[/INST]
```python
n = int(input())
print(n, end=":")
for i in range(2, int(n**0.5)+1):
    if n % i == 0:
        n = n // i
        print(i, end=" ")
    else:
        i += 1
print(n)
```</s>
