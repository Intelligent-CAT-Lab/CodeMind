System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
S=str(input())
a=99999
for i in range(len(S)-2):
  a=min(abs(753-int(S[i]+S[i+1]+S[i+2])),a)
  
print(a)
```


Answer:
Here's the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int a = 99999;
        for (int i = 0; i < S.length() - 2; i++) {
            String substring = S.substring(i, i + 3);
            int num = Integer.parseInt(substring);
            int diff = Math.abs(753 - num);
            a = Math.min(a, diff);
        }
        System.out.println(a);
    }
}
```

This Java code reads a string `S` from the user, initializes `a` to 99999, and then iterates over the string using a for loop. For each iteration, it extracts a substring of length 3 starting from index `i`, converts it to an integer, calculates the absolute difference between that integer and 753, and updates `a` if the new difference is smaller. Finally, it prints the value of `a`.<|endoftext|>
