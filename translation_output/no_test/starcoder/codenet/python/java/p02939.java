<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()

l = [0] * (len(S) + 1)
l[1] = 1
if S[0] == S[1]:
    l[2] = 1
else:
    l[2] = 2

for i in range(3, len(S)+1):
    if S[i-1]!= S[i-2]:
        l[i] = l[i-1] + 1
    else:
        l[i] = l[i-3] + 2

print(l[-1])

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int[] l = new int[S.length()+1];
        l[1] = 1;
        if(S.charAt(0) == S.charAt(1)) l[2] = 1;
        else l[2] = 2;

        for(int i = 3; i <= S.length(); i++){
            if(S.charAt(i-1)!= S.charAt(i-2)) l[i] = l[i-1] + 1;
            else l[i] = l[i-3] + 2;
        }

        System.out.println(l[S.length()]);
    }
}
```
<|endoftext|>
