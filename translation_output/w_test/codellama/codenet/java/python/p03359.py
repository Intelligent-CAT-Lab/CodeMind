<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5

Expected output:
5


```
import java.util.Scanner;
class p03359{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt(); 
        if(b>=a){
            System.out.println(a);
        }else{
            System.out.println(a-1);
        }
    }
}
```
[/INST]
```
import sys

a, b = map(int, input().split())

if b >= a:
    print(a)
else:
    print(a - 1)
```
Explanation:

* `map(int, input().split())` is used to read the input as a list of integers.
* `if b >= a:` is used to check if the second number is greater than or equal to the first number.
* `print(a)` is used to print the first number if the condition is true, and `print(a - 1)` is used to print the first number minus 1 if the condition is false.

Note: The `input()` function is used to read a line of input from the user, and the `split()` method is used to split the input into a list of strings. The `map(int, ...)` function is used to convert the list of strings to a list of integers.</s>
