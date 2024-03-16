<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=[int(i) for i in input().split()]
if abs(b-c)%2==0:
	print("Alice")
else:
	print("Borys")
```

java code:<fim_suffix><fim_middle>
```
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
<|endoftext|>
