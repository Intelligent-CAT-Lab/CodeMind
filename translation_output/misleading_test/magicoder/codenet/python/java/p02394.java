<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 4 2 2 1

Expected output:
Yes

```
i = list(map(int, input().split()))

if i[2] + i[4] <= i[0]:
    if i[2] - i[4] >= 0:
        if i[3] + i[4] <= i[1]:
            if i[3] - i[4] >= 0:
                print("Yes")
            else:
                print("No")
        else:
            print("No")
    else:
        print("No")
else:
    print("No")

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] i = new int[input.length];
        for (int j = 0; j < input.length; j++) {
            i[j] = Integer.parseInt(input[j]);
        }

        if (i[2] + i[4] <= i[0]) {
            if (i[2] - i[4] >= 0) {
                if (i[3] + i[4] <= i[1]) {
                    if (i[3] - i[4] >= 0) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads the input from the user, splits it into an array of strings, and then converts each string to an integer. It then checks the conditions in the Python code and prints the result.<｜end▁of▁sentence｜>
