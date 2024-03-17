<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
3


```
# -*- coding: utf-8 -*-

def atack(tairyoku):
    if tairyoku == 1:
        return 1
    else:
        return 1 + atack(int(tairyoku/2)) * 2

H = int(input())

ans = atack(H)

print(ans)
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int ans = atack(H);
        System.out.println(ans);
    }

    public static int atack(int tairyoku) {
        if (tairyoku == 1) {
            return 1;
        } else {
            return 1 + atack(tairyoku / 2) * 2;
        }
    }
}
```
This is the Java code that translates the Python code you provided. The `main` method reads the input from the user, calls the `atack` method with the input value, and prints the result. The `atack` method is a recursive function that calculates the result based on the input value.

Note that in Java, you need to use the `Scanner` class to read input from the user, and the `System.out.println` method to print the output. Also, in Java, you need to specify the data type of the variables, so in this case, I declared `H` and `ans` as `int` variables.</s>
