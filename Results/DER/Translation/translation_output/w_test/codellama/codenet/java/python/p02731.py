<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1.000000000000


```
import java.util.Scanner;

public class p02731{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double L = scan.nextInt();
		scan.close();
		System.out.println(Math.pow(L/3, 3));
	}
}

```
[/INST]
```
import math

L = float(input())
print(math.pow(L/3, 3))
```
Explanation:

* `import math` imports the `math` module, which provides mathematical functions in Python.
* `L = float(input())` reads a floating-point number from the user and assigns it to the variable `L`.
* `print(math.pow(L/3, 3))` calculates the cube of `L/3` using the `pow()` function from the `math` module, and prints the result.

Note: The `float()` function is used to convert the input from a string to a floating-point number.</s>
