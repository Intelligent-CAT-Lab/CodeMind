System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
Here's the Java code equivalent to the given Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[100];
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < 12; i++) {
            int num = Integer.parseInt(input[i]) - 1;
            a[num]++;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] > 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        if (c == 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
```

This Java code does the same thing as the given Python code. It initializes an array `a` of size 100 with all elements set to 0. It then reads 12 integers from the user and increments the corresponding element in `a` by 1. Next, it iterates over the elements of `a` and checks if the element is greater than 0 and divisible by 4. If so, it adds the element divided by 4 to the variable `c`. Finally, it prints "yes" if `c` is equal to 3, and "no" otherwise.<|endoftext|>
