Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String Alfa = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < Alfa.length(); i++) {
            if (w.indexOf(Alfa.charAt(i))!= w.lastIndexOf(Alfa.charAt(i))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```<|endoftext|>
