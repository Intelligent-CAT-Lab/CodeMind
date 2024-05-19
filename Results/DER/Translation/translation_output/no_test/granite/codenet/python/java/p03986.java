System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
X=input()
ans=0
memo=0
for i in range(len(X)):
    if X[i]=="T":
        if memo==0:pass
        else:memo-=1
    else:memo+=1
print(memo*2)
```


Answer:
Here's the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.nextLine();
        int ans = 0;
        int memo = 0;

        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == 'T') {
                if (memo == 0) {
                    // Do nothing
                } else {
                    memo -= 1;
                }
            } else {
                memo += 1;
            }
        }

        System.out.println(memo * 2);
    }
}
```

This Java code reads a string `X` from the user, initializes `ans` and `memo` to 0, and then iterates over each character in `X`. If the character is 'T', it checks if `memo` is 0. If it is, it does nothing. Otherwise, it decrements `memo` by 1. If the character is not 'T', it increments `memo` by 1. Finally, it prints the value of `memo` multiplied by 2.<|endoftext|>
