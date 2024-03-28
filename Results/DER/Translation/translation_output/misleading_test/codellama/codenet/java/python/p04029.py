<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1

```
import java.util.Scanner;

class p04029{

  public static void main(String arg[]){
  Scanner sc = new Scanner(System.in);
    
    int sum = 0;
    int n = sc.nextInt();
    for(int i = 1;i<=n;i++){
    sum = sum + i;
    }
    System.out.println(sum);
  }

}
```
[/INST]
```
import sys

n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i
print(sum)
```
Explanation:

* `import sys` is used to import the `sys` module, which is used to read input from the user.
* `n = int(input())` is used to read an integer input from the user and assign it to the variable `n`.
* `sum = 0` is used to initialize the variable `sum` to 0.
* `for i in range(1, n+1):` is used to iterate from 1 to `n` and add each number to the `sum` variable.
* `print(sum)` is used to print the final value of `sum`.

Note: The `range(1, n+1)` function is used to create a range of numbers from 1 to `n`, and the `+1` is used to include `n` in the range.</s>
