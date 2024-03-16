<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
S=input()
b=S.replace("A","")=="KIHBR"
if b:
    L=list(map(len, "".join("*" if s!="A" else s for s in S).split("*")))
    X=[1,0,0,1,1,1,1]
    b&=all(L[i]<=X[i] for i in range(len(L)))
print("YNEOS"[not b::2])
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] L = "".join("*" if s != "A" else s for s in S).split("*");
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            b &= java.util.stream.IntStream.range(0, L.length).allMatch(i -> L[i].length() <= X[i]);
        }
        System.out.println(b ? "YNEOS" : "YNEOS".substring(1));
    }
}
```

Please note that Java does not support list comprehension and string formatting like Python does. So, the code is a bit more verbose and requires more lines of code. Also, Java does not have a built-in `all` function like Python, so we use `java.util.stream.IntStream.range(0, L.length).allMatch(i -> L[i].length() <= X[i]);` to achieve the same functionality.<｜end▁of▁sentence｜>
