<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:
A


```
S = list(map(int,input().split()))
if S.index(max(S)) == 0:
    print("A")
elif S.index(max(S)) == 1:
    print("B")
elif S.index(max(S)) == 2:
    print("C")

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] S = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            S[i] = Integer.parseInt(input[i]);
        }
        int maxIndex = 0;
        for (int i = 1; i < S.length; i++) {
            if (S[i] > S[maxIndex]) {
                maxIndex = i;
            }
        }
        switch (maxIndex) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
        }
    }
}
```

This Java code reads the input from the user, splits it into an array of strings, converts each string to an integer, and stores it in an array of integers. It then finds the index of the maximum value in the array and prints the corresponding letter.<｜end▁of▁sentence｜>
