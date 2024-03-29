<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 4 0 4 1

Expected output:
0


```
import java.util.Scanner;

public class p00291 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a[]=new int[6];
		int b=0;
		for(int i=0;i<6;i++){
			a[i]=stdIn.nextInt();
		}
		b=a[0]+a[1]*5+a[2]*10+a[3]*50+a[4]*100+a[5]*500;
		if(1000<=b)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
```
[/INST]
```python
a = list(map(int, input().split()))
b = a[0] + a[1]*5 + a[2]*10 + a[3]*50 + a[4]*100 + a[5]*500
if b <= 1000:
    print("0")
else:
    print("1")
```</s>
