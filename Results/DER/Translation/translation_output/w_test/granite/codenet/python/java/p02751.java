System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
111


```
n,m=map(int,input().split())
ans=[["1"]*(2**m-1) for _ in range(2**n-1)]
for k in range(1,11):
    for i in range(2**k,2**n,2**k):
        for j in range(2**k,2**m,2**k):
            if ans[i-1][j-1]=="1":
                ans[i-1][j-1]="0"
            else:
                ans[i-1][j-1]="1"
for i in range(2**n-1):
    print("".join(ans[i]))
```


Answer:
Here's the Java code equivalent to the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] ans = new String[2**n-1][2**m-1];
        for (int i = 0; i < 2**n-1; i++) {
            Arrays.fill(ans[i], "1");
        }
        for (int k = 1; k < 11; k++) {
            for (int i = 2**k; i < 2**n; i += 2**k) {
                for (int j = 2**k; j < 2**m; j += 2**k) {
                    if (ans[i-1][j-1].equals("1")) {
                        ans[i-1][j-1] = "0";
                    } else {
                        ans[i-1][j-1] = "1";
                    }
                }
            }
        }
        for (int i = 0; i < 2**n-1; i++) {
            System.out.println(String.join("", ans[i]));
        }
    }
}
```

You can test this code with the provided test case:

```java
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "1 2";
        String expectedOutput = "111";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        Scanner sc = new Scanner(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{});
        String actualOutput = baos.toString().trim();
        System.setOut(null);
        sc.close();
        if (actualOutput.equals(expectedOutput)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected output: " + expectedOutput);
            System.out.println("Actual output: " + actualOutput);
        }
    }
}
``` <|endoftext|>
