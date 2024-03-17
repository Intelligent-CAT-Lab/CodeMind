<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 3

Expected output:
2.6666666667


```
import java.util.Scanner;

public class p03135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		double a;
		a = (double) T / X;
		System.out.println(a);
	}
}

```
[/INST]
```
import math

def main():
    T = int(input("Enter the value of T: "))
    X = int(input("Enter the value of X: "))
    a = T / X
    print(a)

if __name__ == "__main__":
    main()
```
Note: The `math` module is not required in this case, but it is used to make the code more readable and to avoid using the `float` type.</s>
