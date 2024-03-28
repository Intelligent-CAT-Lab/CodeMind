<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2 4

Expected output:
A\iw#

```
a,b,c=[int(i) for i in input().split()]
if abs(b-c)%2==0:
	print("Alice")
else:
	print("Borys")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(Math.abs(b-c)%2==0)
			System.out.println("Alice");
		else
			System.out.println("Borys");
	}
}
```
'''
<|endoftext|>
