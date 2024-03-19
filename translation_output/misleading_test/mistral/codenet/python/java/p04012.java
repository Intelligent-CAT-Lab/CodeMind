<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abaccaba

Expected output:
Ye

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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Alfa = "abcdefghijklmnopqrstuvwxyz";
        String w = scanner.nextLine();
        for (char i : Alfa.toCharArray()) {
            if (w.indexOf(i) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```
Sample test case:
```
abaccaba
```
Expected output:
```
Ye
```</s>
