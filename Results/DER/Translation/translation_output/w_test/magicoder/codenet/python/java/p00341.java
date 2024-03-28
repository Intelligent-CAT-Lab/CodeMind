<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 3 4 8 9 7 3 4 5 5 5

Expected output:
no


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
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[100];
        String[] input = scanner.nextLine().split(" ");
        int[] b = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            b[i] = Integer.parseInt(input[i]);
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

This Java code does the same thing as the Python code. It reads the input, splits it into an array of integers, and then counts the occurrences of each integer in the array. It then checks if the count of each integer is a multiple of 4 and adds up the counts that meet this condition. If the total count is 3, it prints "yes", otherwise it prints "no".<｜end▁of▁sentence｜>
