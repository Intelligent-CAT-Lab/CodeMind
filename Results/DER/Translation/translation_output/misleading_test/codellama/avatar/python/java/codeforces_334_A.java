<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
1 36
2 35
3 34
4 33
5 32
6 31
7 30
8 29
9 28
10 27
11 26
12 25
13 24
14 23
15 22
16 21
17 20
18 19


```
n = int ( input ( ) )
i , j = 1 , n * n
while i < j :
    print ( i , j )
    i += 1
    j -= 1


```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1, j = n * n;
        while (i < j) {
            System.out.println(i + " " + j);
            i++;
            j--;
        }
    }
}
```
This code first prompts the user to enter a number `n`, and then it initializes two variables `i` and `j` with values `1` and `n * n` respectively.

The `while` loop starts with `i` being less than `j`, and it prints the values of `i` and `j` on separate lines. Then, it increments `i` and decrements `j`.

The loop continues until `i` becomes greater than or equal to `j`, at which point the loop exits.

The output of the program will be the same as the expected output in the question, with the numbers `1` to `n` printed on separate lines.</s>
