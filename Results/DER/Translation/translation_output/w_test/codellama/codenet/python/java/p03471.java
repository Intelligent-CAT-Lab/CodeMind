<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9 45000

Expected output:
4 0 5


```
n,y=map(int,input().split())
for i in range(n+1):
    for j in range(n-i+1):
        if (y-(i*10000+j*5000))/1000==(n-i-j):
            print(str(i)+' '+str(j)+' '+str(n-i-j))
            exit()
print('-1 -1 -1')
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if ((y - (i * 10000 + j * 5000)) / 1000 == (n - i - j)) {
                    System.out.println(i + " " + j + " " + (n - i - j));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `for` loops are used to iterate over the possible values of `i` and `j`, and the `if` statement is used to check if the equation is satisfied. If the equation is satisfied, the program prints the values of `i`, `j`, and `n - i - j`, and then exits. If the equation is not satisfied, the program prints `-1 -1 -1` and exits.</s>
