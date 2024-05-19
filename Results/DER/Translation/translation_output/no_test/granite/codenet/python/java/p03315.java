System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
a=input()
e=a.count("+")
f=a.count("-")
print(e-f)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int e = 0;
        int f = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '+') {
                e++;
            } else if (a.charAt(i) == '-') {
                f++;
            }
        }

        System.out.println(e - f);
    }
}
```<|endoftext|>
