<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n = input()
print(max(int(n[0])-1+9*(len(n)-1),sum([int(i) for i in n])))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int result = Math.max(10*n.length()-1, n.charAt(0)-1+9*(n.length()-1));
        System.out.println(result);
    }
}
```</s>
