<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
def p03106():
    A = int(input())
    B = int(input())
    K = int(input())
    s = []
    z = 1
    y = 0
    while z <= A and z <= B:
        if A % z == 0 and B % z == 0:
            s.append(z)
            y += 1
        z += 1
    print(s[y - K])

p03106()
```
This Python code does the same thing as the Java code. It reads three integers from the standard input, finds all common divisors of the two integers, and prints the Kth smallest one.
<|EOT|>
