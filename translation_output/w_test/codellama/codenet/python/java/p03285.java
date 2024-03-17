<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11

Expected output:
Yes


```
N = int(input())
for i in range(25):
  for j in range(20):
    if 4*i + 7*j == N:
      print('Yes')
      exit()
print('No')
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i <= 25; i++) {
            for (int j = 0; j <= 20; j++) {
                if (4*i + 7*j == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
```
This code uses a nested for loop to iterate through the possible values of `i` and `j` that satisfy the equation `4*i + 7*j == N`. If such a pair is found, the program prints "Yes" and exits. If no such pair is found, the program prints "No".

Note that the `return` statement is used to exit the program early if a solution is found. This is more efficient than printing "Yes" and then continuing to search for other solutions.</s>
