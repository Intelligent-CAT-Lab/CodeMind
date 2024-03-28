<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
PD?D??P

Expected output:
PDPDPDP


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
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='?'){
                ch[i]='D';
            }
        }
        System.out.println(new String(ch));
    }
}
```
'''
<|endoftext|>
