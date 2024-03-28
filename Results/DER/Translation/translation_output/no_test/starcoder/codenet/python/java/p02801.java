<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
C=input()
al=[]
for idx in range(97,123):
  al.append(chr(idx))
idx = al.index(C)
print(al[idx+1])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String C = sc.next();
        char[] al = new char[26];
        for (int i = 0; i < 26; i++) {
            al[i] = (char) ('a' + i);
        }
        int idx = Arrays.binarySearch(al, C);
        System.out.println(al[idx + 1]);
    }
}
```
<|endoftext|>
