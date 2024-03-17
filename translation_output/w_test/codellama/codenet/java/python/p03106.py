<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 12 2

Expected output:
2


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
```
import sys

def main():
    A, B, K = map(int, sys.stdin.readline().split())
    s = []
    z = 1
    while z <= A and z <= B:
        if A % z == 0 and B % z == 0:
            s.append(z)
        z += 1
    print(s[len(s) - K])

if __name__ == "__main__":
    main()
```
This is a Python implementation of the Java code you provided. It uses the `sys` module to read input from stdin and the `map` function to convert the input strings to integers. The rest of the code is similar to the Java code, with a few minor changes to make it more Pythonic.

Note that the Python code uses a list `s` to store the common divisors, while the Java code uses an array `s[]`. In Python, we can simply use a list and append elements to it as needed, rather than having to specify the size of the array upfront.

Also, in Python, we can use the `len` function to get the length of a list, rather than having to keep track of the index `y` as in the Java code.</s>
