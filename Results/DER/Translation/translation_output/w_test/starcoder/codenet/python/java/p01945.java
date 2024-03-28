<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
((*)())

Expected output:
2


```
S=list(input())
N=S.index('*')
P=abs(S[0:N].count('(')-S[0:N].count(')'))
Q=abs(S[N+1:len(S)].count('(')-S[N+1:len(S)].count(')'))
print(min(P,Q))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.indexOf('*');
        int p=Math.abs(s.substring(0,n).replaceAll("[()]"," ").split(" ").length-s.substring(0,n).replaceAll("[()]"," ").split(" ").length);
        int q=Math.abs(s.substring(n+1,s.length()).replaceAll("[()]"," ").split(" ").length-s.substring(n+1,s.length()).replaceAll("[()]"," ").split(" ").length);
        System.out.println(Math.min(p,q));
    }
}
```
<|endoftext|>
