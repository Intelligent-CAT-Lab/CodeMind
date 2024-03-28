<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
moji = str(input())
ans = ""
for i in range(len(moji)):
    ans += ("1","9")[moji[i]=="1"]
print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String moji = sc.next();
        String ans = "";
        for(int i = 0; i < moji.length(); i++){
            ans += (moji.charAt(i) == '1')? "9" : "1";
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
