<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
2
0
11
-87

```
n=input()

if n==1:
	print "1\n0"
elif n==2:
	print "2\n0\n11"
else:
	print n-1
	for i in xrange(n-1):
		print "1"+("0"*i)+"1"


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1){
			System.out.println("1\n0");
		}
		else if(n==2){
			System.out.println("2\n0\n11");
		}
		else{
			System.out.println(n-1);
			for(int i=0;i<n-1;i++){
				System.out.println("1"+"0"*i+"1");
			}
		}
	}
}
```
<|endoftext|>
