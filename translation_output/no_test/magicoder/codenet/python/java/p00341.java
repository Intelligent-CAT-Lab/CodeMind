<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[100];
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] b = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            b[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < 12; i++) {
            a[b[i] - 1]++;
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

This Java code does the same thing as the Python code. It initializes an array `a` with 100 elements all set to 0, then it reads a line of input from the user, splits it into an array of strings, converts each string to an integer, and stores it in array `b`. It then iterates over the first 12 elements of `b`, incrementing the corresponding element in `a`. It then counts the number of elements in `a` that are not 0 and are divisible by 4, and stores this count in `c`. Finally, it prints "yes" if `c` is 3, and "no" otherwise.<｜end▁of▁sentence｜>
