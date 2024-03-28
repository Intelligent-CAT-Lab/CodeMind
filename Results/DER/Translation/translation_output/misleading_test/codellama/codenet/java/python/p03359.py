<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5

Expected output:
-80

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

* `map(int, input().split())` is used to convert the input string into a list of integers.
* `a, b = map(int, input().split())` is used to unpack the list of integers into two variables `a` and `b`.
* `if b >= a:` is used to check if `b` is greater than or equal to `a`.
* `print(a)` is used to print the value of `a` if `b` is greater than or equal to `a`.
* `print(a - 1)` is used to print the value of `a - 1` if `b` is less than `a`.

Note: The `input()` function is used to read a line of input from the user, and the `split()` method is used to split the input string into a list of strings, where each string is a single number. The `map()` function is then used to convert each string in the list into an integer.</s>
