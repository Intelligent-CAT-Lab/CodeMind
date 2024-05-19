System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
YKs

```
s = input()
ss = ""
p = 0
for i in range(len(s)):
    if p == 0 and s[i] == "C":
        p = 1
    elif p == 1 and s[i] == "F":
        p = 2
print("Yes" if p == 2 else "No")
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ss = "";
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (p == 0 && s.charAt(i) == 'C') {
                p = 1;
            } else if (p == 1 && s.charAt(i) == 'F') {
                p = 2;
            }
        }
        System.out.println(p == 2? "Yes" : "No");
    }
}
```

You can run this code in a Java IDE or compile and run it from the command line using the following commands:

```
javac Main.java
java Main
```

This code reads a string from the user, iterates through each character, and checks if the current character is 'C' and the previous character is also 'C'. If so, it sets the flag `p` to 1. Then, it checks if the current character is 'F' and the flag `p` is 1. If so, it sets the flag `p` to 2. Finally, it prints "Yes" if the flag `p` is 2, otherwise it prints "No".<|endoftext|>
