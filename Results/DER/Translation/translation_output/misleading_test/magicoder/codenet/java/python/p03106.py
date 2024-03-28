<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def main():
    A, B, K = map(int, input().split())
    s = []
    for i in range(1, min(A, B) + 1):
        if A % i == B % i == 0:
            s.append(i)
    print(s[-K])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It calculates the greatest common divisor (gcd) of two numbers and stores it in a list. The last element of the list is the Kth greatest common divisor. The `if __name__ == "__main__":` part is used to run the `main()` function when the script is run directly.<｜end▁of▁sentence｜>
