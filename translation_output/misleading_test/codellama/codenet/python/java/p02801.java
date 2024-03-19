<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
a

Expected output:
bH

```
C=input()
al=[]
for idx in range(97,123):
  al.append(chr(idx))
idx = al.index(C)
print(al[idx+1])
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int index = Arrays.asList(alphabet).indexOf(input.charAt(0));
        System.out.println(alphabet[index + 1]);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays.asList()` method to convert the alphabet array into a list, which allows us to use the `indexOf()` method to find the index of the input character in the alphabet. Finally, we print the character at the next index in the alphabet.</s>
