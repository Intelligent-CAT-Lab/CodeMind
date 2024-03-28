<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
b=input()
if b =='A':
    print('T')
elif b=='C':
    print('G')
elif b=='G':
    print('C')
else:
    print('A')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();
        if (b.equals("A")) {
            System.out.println("T");
        } else if (b.equals("C")) {
            System.out.println("G");
        } else if (b.equals("G")) {
            System.out.println("C");
        } else {
            System.out.println("A");
        }
    }
}
```</s>
