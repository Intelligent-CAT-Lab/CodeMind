<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999

Expected output:
ABC


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
```java
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
This code takes an integer input from the command line and checks if it is less than 1000. If it is, it prints "ABC" to the console, otherwise it prints "ABD".</s>
