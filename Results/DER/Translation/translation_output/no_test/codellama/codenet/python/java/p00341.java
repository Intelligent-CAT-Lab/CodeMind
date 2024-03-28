<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a=[0]*100
b=list(map(int,input().split()))
for i in range(12):
    a[b[i]-1]+=1
c=0
for i in range(100):
    if a[i] and a[i]%4==0: c+=a[i]//4
print('yes' if c==3 else 'no')

Translate the above python code to java.

java code:

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
        for (int i = 0; i < 100; i++) {
            a[i] = 0;
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
        if (c == 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and it uses arrays to store the values of `a` and `b`. The code is similar to the Python code, but it uses Java's syntax and data structures.</s>
