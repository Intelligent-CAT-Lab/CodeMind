<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999

Expected output:
ABC[

```
# -*- coding:utf-8 -*-
if __name__ == "__main__":
    n = int(input())
    if n < 1000:
        print("ABC")
    else:
        print("ABD")
```
[/INST]
```
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n < 1000) {
            System.out.println("ABC");
        } else {
            System.out.println("ABD");
        }
    }
}
```
This code takes a single command-line argument `n` and converts it to an integer using `Integer.parseInt()`. It then checks if `n` is less than 1000, and if it is, it prints "ABC" to the console. If `n` is greater than or equal to 1000, it prints "ABD" to the console.

Here's an example of how to run this code:
```
$ java Main 999
ABC
```
This will print "ABC" to the console because 999 is less than 1000.</s>
