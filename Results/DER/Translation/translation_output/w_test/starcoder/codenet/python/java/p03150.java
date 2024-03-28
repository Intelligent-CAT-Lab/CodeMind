<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
keyofscience

Expected output:
YES


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
        String S = sc.next();
        for(int i=0;i<S.length();i++){
            for(int j=i;j<S.length()+1;j++){
                if(S.substring(0,i)+S.substring(j).equals("keyence")){
                    System.out.println("YES");
                    return;
                }
            }
        }
        for(int k=0;k<S.length();k++){
            if(S.substring(k).equals("keyence")){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
```
'''
<|endoftext|>
