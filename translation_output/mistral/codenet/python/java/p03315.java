<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a=input()
e=a.count("+")
f=a.count("-")
print(e-f)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int e = a.count("+");
        int f = a.count("-");
        System.out.println(e - f);
    }
}
```</s>
