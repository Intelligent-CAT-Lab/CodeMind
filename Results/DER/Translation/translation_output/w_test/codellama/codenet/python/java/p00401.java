<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
54

Expected output:
32


```
N = int(input())
count = 1
while count <= N:
    count *= 2
print(round(count/2))

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println(Math.round(count/2));
    }
}
```
This code takes an integer `N` as input and calculates the number of times `count` needs to be doubled to reach `N`. It then prints the result rounded to the nearest integer.

Here's a breakdown of the code:

* `int N = Integer.parseInt(args[0]);`: This line reads the input `N` from the command line and converts it to an integer.
* `int count = 1;`: This line initializes the variable `count` to 1.
* `while (count <= N) {`: This line starts a loop that runs while `count` is less than or equal to `N`.
* `count *= 2;`: This line doubles `count` each time the loop runs.
* `}`: This line ends the loop.
* `System.out.println(Math.round(count/2));`: This line prints the result rounded to the nearest integer.

Note that the `Math.round()` method is used to round the result to the nearest integer.</s>
