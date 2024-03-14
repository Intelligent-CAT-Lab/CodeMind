<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
ans = ""
flag = False
for c in s:
  if c == "A" and not flag:flag = True
  if c == "Z" and flag:
    ans += "AZ"
    flag = False
if ans == "":
  print(-1)
else:
  print(ans)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        boolean flag = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A' &&!flag){
                flag = true;
            }
            if(s.charAt(i) == 'Z' && flag){
                ans += "AZ";
                flag = false;
            }
        }
        if(ans.equals(""))
            System.out.println(-1);
        else
            System.out.println(ans);
    }
}
```
<|endoftext|>
