System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abaccaba

Expected output:
Yes


```
# coding = SJIS
Alfa = "abcdefghijklmnopqrstuvwxyz"
w = str(input())
for i in Alfa:
    if w.count(i) % 2 == 1:
        print("No")
        exit()
print("Yes")
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alfa.length(); i++) {
            char c = alfa.charAt(i);
            if (w.length() - w.replaceAll(String.valueOf(c), "").length() % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```

Test input:
abaccaba

Expected output:
Yes<|endoftext|>
