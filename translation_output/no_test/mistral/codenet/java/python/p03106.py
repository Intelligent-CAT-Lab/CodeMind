<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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

A = int(input())
B = int(input())
K = int(input())

s = [0] * (A + B)
z = 1
y = 0

while z <= A and z <= B:
    if A % z == 0 and B % z == 0:
        s[y] = z
        y += 1
    z += 1

print(s[y - K])
```</s>
