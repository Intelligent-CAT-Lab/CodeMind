<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
A = list()
for i in range(1,n+1):
    if i % 3 == 0:
        A.append(i)
    elif "3" in str(i):
        A.append(i)
print(" ", end="")
for i in range(len(A)-1):
    print(A[i], end=" ")
print(A[len(A)-1])


```

@@ Response
```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                A.add(i);
            }
        }
        for (int i = 0; i < A.size() - 1; i++) {
            System.out.print(A.get(i) + " ");
        }
        System.out.println(A.get(A.size() - 1));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, then creates an ArrayList to store the numbers that are multiples of 3 or contain the digit 3. It then prints out the numbers in the ArrayList separated by spaces.<｜end▁of▁sentence｜>
