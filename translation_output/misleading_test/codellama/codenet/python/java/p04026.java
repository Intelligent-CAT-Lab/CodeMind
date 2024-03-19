<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
needed

Expected output:
5

```
s=input()
for i in range(len(s)-1):
    if s[i]==s[i+1]:
        print(i+1,i+2)
        exit()
for i in range(len(s)-2):
    if s[i]==s[i+2]:
        print(i+1,i+3)
        exit()
print(-1,-1)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] result = findMatchingIndices(s);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] findMatchingIndices(String s) {
        int[] result = new int[]{-1, -1};
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                result[0] = i + 1;
                result[1] = i + 2;
                break;
            }
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                result[0] = i + 1;
                result[1] = i + 3;
                break;
            }
        }
        return result;
    }
}
```
This code uses a `Scanner` to read a line of input from the user, and then calls the `findMatchingIndices` method to find the indices of the first two characters that are the same. The `findMatchingIndices` method iterates over the characters in the string, and checks if the current character is the same as the next character. If it is, it sets the first element of the `result` array to the index of the current character, and the second element to the index of the next character. It then breaks out of the loop and returns the `result` array.

The `main` method then prints the first two elements of the `result` array, which will be the indices of the first two characters that are the same. If no such characters are found, the `result` array will contain the values `-1` and `-1`, which are printed to the console.</s>
