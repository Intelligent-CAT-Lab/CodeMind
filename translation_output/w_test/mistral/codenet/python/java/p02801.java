<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
a

Expected output:
b


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
        ArrayList<Character> al = new ArrayList<Character>();
        for (int idx = 97; idx < 123; idx++) {
            al.add((char) idx);
        }
        char C = sc.next().charAt(0);
        int idx = al.indexOf(C);
        System.out.println(al.get(idx + 1));
    }
}
```</s>
