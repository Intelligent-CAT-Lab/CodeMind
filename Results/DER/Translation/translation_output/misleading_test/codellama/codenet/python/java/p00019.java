<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
215

```
n = int(input())
k = 1
for j in range(1,n+1):
    k *= j
print(k)

```
[/INST]
```java
public class Factorial {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = 1;
        for (int j = 1; j <= n; j++) {
            k *= j;
        }
        System.out.println(k);
    }
}
```
This code takes an integer `n` as input and calculates the factorial of `n`. It then prints the result.

Here's a breakdown of the code:

* `int n = Integer.parseInt(args[0]);`: This line gets the input from the command line and converts it to an integer.
* `int k = 1;`: This line initializes the variable `k` to 1.
* `for (int j = 1; j <= n; j++)`: This line starts a loop that runs `n` times.
* `k *= j;`: This line multiplies `k` by `j`, which is the current value of the loop variable `j`.
* `System.out.println(k);`: This line prints the final value of `k`, which is the factorial of `n`.

Note that this code assumes that the input is a positive integer. If the input is not a positive integer, the code will throw a `NumberFormatException`.</s>
