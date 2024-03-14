<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a=[0]*100
b=list(map(int,input().split()))
for i in range(12):
    a[b[i]-1]+=1
c=0
for i in range(100):
    if a[i] and a[i]%4==0: c+=a[i]//4
print('yes' if c==3 else 'no')
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[100];
        Scanner scanner = new Scanner(System.in);
        int[] b = new int[12];
        for (int i = 0; i < 12; i++) {
            b[i] = scanner.nextInt();
            a[b[i] - 1] += 1;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] != 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        System.out.println(c == 3 ? "yes" : "no");
    }
}
```

This Java code does the same thing as your Python code. It initializes an array `a` of size 100 with all elements set to 0, then reads in 12 integers from the user and increments the corresponding index in `a` by 1. It then counts the number of elements in `a` that are divisible by 4 and adds this count to `c`. Finally, it prints "yes" if `c` is equal to 3, and "no" otherwise.
<|EOT|>
