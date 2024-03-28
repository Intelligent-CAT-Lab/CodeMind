<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
TSTTSS

Expected output:
4


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

@@ Response
Here is the Java version of the given Python code:

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
                    continue;
                } else {
                    memo--;
                }
            } else {
                memo++;
            }
        }
        System.out.println(memo * 2);
    }
}
```

You can test this code with the following test input:

```
TSTTSS
```

And it should output:

```
4
```<｜end▁of▁sentence｜>
