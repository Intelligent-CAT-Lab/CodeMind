<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 4 3

Expected output:
10

```
A, B, C = map(int, input().split())

get = A - B

i = C - get

if i < 0:
    i = 0
     
print(i)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int get = A - B;
        int i = C - get;
        if (i < 0) {
            i = 0;
        }
        System.out.println(i);
    }
}
```
This code first prompts the user to enter three integers separated by spaces, and then it reads the input using the `Scanner` class. It then calculates the difference between the first two numbers and stores it in a variable called `get`. It then calculates the difference between the third number and the result of the previous calculation, and stores it in a variable called `i`. Finally, it checks if `i` is less than 0, and if it is, it sets `i` to 0. It then prints the value of `i` to the console.</s>
