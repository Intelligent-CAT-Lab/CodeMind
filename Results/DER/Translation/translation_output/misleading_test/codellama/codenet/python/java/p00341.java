<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 3 4 8 9 7 3 4 5 5 5

Expected output:
n=

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
```java
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
            a[b[i] - 1]++;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        System.out.println(c == 3 ? "yes" : "no");
    }
}
```
This code first creates an array `a` of size 100 and initializes all elements to 0. It then creates an array `b` of size 12 and reads in 12 integers from the user.

Next, it iterates over the elements of `b` and increments the corresponding element in `a`. For example, if `b[i]` is 3, it will increment `a[2]`.

After that, it iterates over the elements of `a` and checks if each element is divisible by 4. If it is, it adds the element to the variable `c`.

Finally, it prints "yes" if `c` is equal to 3, and "no" otherwise.

Note that the code assumes that the input will contain exactly 12 integers, and that each integer will be between 1 and 100 inclusive. If the input does not meet these requirements, the code may produce incorrect results or crash.</s>
