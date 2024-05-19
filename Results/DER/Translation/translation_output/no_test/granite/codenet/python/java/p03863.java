System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
s=input()
if (s[0]==s[-1] and len(s)%2==0) or (s[0]!=s[-1] and len(s)%2==1):
 print("First")
else:
 print("Second")
```


Answer:
Here's the Java code equivalent to the Python code you provided:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if ((s.charAt(0) == s.charAt(s.length() - 1) && s.length() % 2 == 0) ||
                (s.charAt(0)!= s.charAt(s.length() - 1) && s.length() % 2 == 1)) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}
```

In this Java code, we use the `Scanner` class to read a line of input from the user. We then check if the first and last characters of the input string `s` are the same and if the length of `s` is even, or if they are different and the length of `s` is odd. If either of these conditions is true, we print "First", otherwise we print "Second".<|endoftext|>
