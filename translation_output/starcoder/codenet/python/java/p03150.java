<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()
for i in range(len(S)):
    for j in range(i,len(S)+1):
        if S[:i]+S[j:] == "keyence":
            print("YES")
            exit()
for k in range(len(S)):
    if S[i::i+8] == "keyence":
        print("YES")
        exit()
print("NO")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length()+1;j++){
                if(s.substring(0,i)+s.substring(j).equals("keyence")){
                    System.out.println("YES");
                    return;
                }
            }
        }
        for(int k=0;k<s.length();k++){
            if(s.substring(k).equals("keyence")){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
```
<|endoftext|>
