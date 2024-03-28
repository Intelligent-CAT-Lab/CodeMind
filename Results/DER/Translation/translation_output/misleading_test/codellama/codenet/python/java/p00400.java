<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
67

Expected output:
-37

```
n=int(input())
if(n>=65 and n<=90):
    print("1")
elif(n>=97 and n<=122):
    print("2")
else:
    print("0")

```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n >= 65 && n <= 90) {
            System.out.println("1");
        } else if (n >= 97 && n <= 122) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}
```
This code takes an integer input from the command line and checks if it is between 65 and 90 (inclusive) or between 97 and 122 (inclusive). If it is, it prints "1" or "2" respectively, otherwise it prints "0".

Note that in Java, the `parseInt()` method is used to convert a string to an integer, and the `args` array is used to access the command line arguments.</s>
