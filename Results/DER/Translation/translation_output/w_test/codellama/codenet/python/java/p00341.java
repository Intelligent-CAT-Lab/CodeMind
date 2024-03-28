<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int[] b = new int[12];
        for (int i = 0; i < 12; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < 12; i++) {
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
This code first creates an array `a` of size 100 and initializes all elements to 0. It then creates an array `b` of size 12 and reads in 12 integers from the user.

Next, it iterates over the elements of `b` and increments the corresponding element in `a` by 1.

After that, it iterates over the elements of `a` and checks if the element is not 0 and if the element is divisible by 4. If both conditions are true, it increments `c` by the element divided by 4.

Finally, it prints "yes" if `c` is equal to 3, and "no" otherwise.

Note that the code uses the `Scanner` class to read in the input from the user, and the `System.out.println()` method to print the output.</s>
