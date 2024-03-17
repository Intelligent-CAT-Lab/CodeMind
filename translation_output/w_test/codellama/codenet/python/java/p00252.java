<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 1

Expected output:
Open


```
B = input()

O = ["1 1 0", "0 0 1"]

if B in O :
    print("Open")
else :
    print("Close")


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String B = scanner.nextLine();

        String[] O = {"1 1 0", "0 0 1"};

        if (Arrays.asList(O).contains(B)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays.asList()` method to convert the `O` array into a list that can be searched using the `contains()` method. The `contains()` method returns `true` if the input string is found in the list, and `false` otherwise.

The code then prints "Open" if the input string is found in the list, and "Close" otherwise.

Note that this code assumes that the input string is a single line of text, and that it does not contain any whitespace characters. If the input string can contain whitespace characters, you may need to modify the code to handle that case.</s>
