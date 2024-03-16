<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
C=input()
al=[]
for idx in range(97,123):
  al.append(chr(idx))
idx = al.index(C)
print(al[idx+1])
```
[/INST]
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char C = sc.next().charAt(0);
        ArrayList<Character> al = new ArrayList<>();
        for (int idx = 97; idx < 123; idx++) {
            al.add((char) idx);
        }
        int idx = al.indexOf(C);
        System.out.println(al.get(idx + 1));
    }
}
```</s>
