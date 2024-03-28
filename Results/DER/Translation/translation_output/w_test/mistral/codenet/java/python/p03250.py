<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 5 2

Expected output:
53


```
import java.util.Scanner;

public class p03250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String StringA = String.valueOf(a);
		String StringB = String.valueOf(b);
		String StringC = String.valueOf(c);
		
		if (a >= b && a >= c) {
			if (b  >= c) {
				System.out.println(Integer.parseInt(StringA + StringB)+ c);
			} else  {
				System.out.println(Integer.parseInt(StringA + StringC)+ b);
			}
		} else if (b>=a && b >= c){
			if (a>=c) {
				System.out.println(Integer.parseInt(StringB + StringA) + c);
			} else {
				System.out.println(Integer.parseInt(StringB + StringC)+a);	
			}
		} else {
			if(a>= b) {
				System.out.println(Integer.parseInt(StringC + StringA)+b);
			} else {
				System.out.println(Integer.parseInt(StringC + StringB)+a);
			}
		}

	}
}

```
[/INST]
```python
a, b, c = map(int, input().split())

if a >= b and a >= c:
    if b >= c:
        print(a + b + c)
    else:
        print(a + c + b)
elif b >= a and b >= c:
    if a >= c:
        print(b + a + c)
    else:
        print(b + c + a)
else:
    if a >= b:
        print(c + a + b)
    else:
        print(c + b + a)
```</s>
