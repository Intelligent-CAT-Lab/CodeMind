<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a = input()
ans = 0
for i in range(1, len(a)):
  df = a[:i]
  sm = a[i:]
  if sm[0] == "0":continue
  df = int(df)
  sm = int(sm)
  if (df + sm) % 2 == 0 and sm >= df and (sm - df) % 2 == 0:
    ans += 1
if int(a) % 2 == 0:ans += 1
print(ans)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int ans = 0;
        for(int i = 1; i < a.length(); i++){
            String df = a.substring(0, i);
            String sm = a.substring(i);
            if(sm.charAt(0) == '0')continue;
            df = Integer.toString(Integer.parseInt(df));
            sm = Integer.toString(Integer.parseInt(sm));
            if((Integer.parseInt(df) + Integer.parseInt(sm)) % 2 == 0 && Integer.parseInt(sm) >= Integer.parseInt(df) && (Integer.parseInt(sm) - Integer.parseInt(df)) % 2 == 0)ans++;
        }
        if(Integer.parseInt(a) % 2 == 0)ans++;
        System.out.println(ans);
    }
}
```
<|endoftext|>
