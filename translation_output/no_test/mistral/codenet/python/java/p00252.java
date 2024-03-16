<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
B = input()

O = ["1 1 0", "0 0 1"]

if B in O :
    print("Open")
else :
    print("Close")


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String B = scanner.nextLine();
        String[] O = {"1 1 0", "0 0 1"};
        if (O[0].equals(B)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}
```</s>
