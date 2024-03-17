<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5700

Expected output:
5500


```
import java.util.*;

public class p02137 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		System.out.println(p / 500 * 500);
	}
}


```
[/INST]
```
import math

def main():
    p = int(input())
    print(math.floor(p / 500) * 500)

if __name__ == '__main__':
    main()
```
This code uses the `math.floor()` function to round the input down to the nearest multiple of 500, and then multiplies it by 500 to get the desired output. The `if __name__ == '__main__':` block is used to indicate that the `main()` function should be executed when the script is run as a standalone program.</s>
