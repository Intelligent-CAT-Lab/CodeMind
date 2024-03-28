<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
1


```
x = int ( input ( ) )
if x == 1 :
    print ( 0 )
else :
    print ( 1 )


```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        if (x == 1) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```
Explanation:

* `int x = Integer.parseInt(args[0]);` - This line takes the input from the command line and converts it to an integer using the `Integer.parseInt()` method.
* `if (x == 1) {` - This line checks if the input is equal to 1.
* `System.out.println(0);` - This line prints 0 if the input is equal to 1.
* `else {` - This line is executed if the input is not equal to 1.
* `System.out.println(1);` - This line prints 1 if the input is not equal to 1.

Note: The `args` array is used to pass command line arguments to the program. In this case, the input is passed as the first argument to the program.</s>
