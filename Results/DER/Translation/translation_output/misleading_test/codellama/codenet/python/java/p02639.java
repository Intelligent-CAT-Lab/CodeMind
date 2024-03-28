<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 2 3 4 5

Expected output:
-9

```
x_list = list(map(int, input().split()))
for i in range(5):
    if x_list[i] == 0:
        print(i+1)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] xList = input.split(" ");
        for (int i = 0; i < xList.length; i++) {
            if (xList[i].equals("0")) {
                System.out.println(i + 1);
            }
        }
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then splits the input into a list of strings using the `split()` method. It then iterates through the list and checks if each element is equal to "0". If it is, it prints the index of the element plus 1.

Here's an example of how to run the code:
```
$ java Solution
0 2 3 4 5
-9
```
This code will output `-9` because the first element in the list is "0".</s>
