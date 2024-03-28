<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1199

Expected output:
ABC


```
n = int(input())
if(n < 1200):
    print("ABC")
elif(n < 2800):
    print("ARC")
else:
    print("AGC")
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n < 1200) {
            System.out.println("ABC");
        } else if (n < 2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}
```
Note: The `Integer.parseInt()` method is used to convert the input string to an integer. The `args` array is used to access the command-line arguments passed to the program.</s>
