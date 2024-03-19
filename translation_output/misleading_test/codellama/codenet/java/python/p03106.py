<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 12 2

Expected output:
62

```
import java.util.Scanner;
public class p03106 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int K=stdIn.nextInt();
		int s[]=new int[A+B];
		int z=1,y=0;
		while(z<=A&&z<=B){
			if(A%z==0&&B%z==0){
				s[y]=z;
				y++;
			}
			z++;
		}
		System.out.println(s[y-K]);
	}

}
```
[/INST]
```python
import sys

def main():
    A, B, K = map(int, sys.stdin.readline().split())
    s = [x for x in range(1, A + B + 1) if A % x == 0 and B % x == 0]
    print(s[K - 1])

if __name__ == "__main__":
    main()
```
This code uses the `map` function to convert the input from a string to a list of integers, and then uses a list comprehension to create a list of all the numbers between 1 and A + B that are divisible by both A and B. The `K`th element of this list is then printed.

Note that this code assumes that the input is a single line of text, with the three numbers separated by spaces. If the input is in a different format, you may need to modify the code accordingly.</s>
