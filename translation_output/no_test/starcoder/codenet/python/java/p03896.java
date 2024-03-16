<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n=input()
for i in range(n-2/n):print-(n<3)or" ".join(`(i-~(j^(n%2<(j+2<n>i*2))))%n+1`for j in range(n-1))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n-2/n;i++){
			System.out.println(-(n<3)or" "+".join(Integer.toString((i-~(j^(n%2<(j+2<n>i*2))))%n+1)for j in range(n-1)));
		}
	}
}
```
<|endoftext|>
