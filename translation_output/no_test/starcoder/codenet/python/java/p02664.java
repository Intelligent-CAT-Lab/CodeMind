<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a=input()

a=list(a)

for i in range(len(a)):
	if a[i]=="?":
		a[i]="D"

b=""
for i in range(len(a)):
	b+=a[i]

print(b)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++){
			if(b[i]=='?'){
				b[i]='D';
			}
		}
		System.out.println(new String(b));
	}
}
```
<|endoftext|>
