<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
S=input()
b=S.replace("A","")=="KIHBR"
if b:
    L=list(map(len, "".join("*" if s!="A" else s for s in S).split("*")))
    X=[1,0,0,1,1,1,1]
    b&=all(L[i]<=X[i] for i in range(len(L)))
print("YNEOS"[not b::2])
```
[/INST]
```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            List<Integer> L = Arrays.asList(
                    Arrays.stream(S.replace("A", "").split("*")).mapToInt(s -> s.length() == 1 ? 1 : 0).toArray()
            );
            List<Integer> X = Arrays.asList(1, 0, 0, 1, 1, 1, 1);
            b &= Arrays.stream(L).allMatch(x -> x <= X.get(x));
        }
        System.out.println("YNEOS".substring(b ? 0 : 1));
    }
}
```</s>
