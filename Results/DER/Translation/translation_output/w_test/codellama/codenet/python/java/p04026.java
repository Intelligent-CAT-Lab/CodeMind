<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
needed

Expected output:
2 5


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
        int[] indices = findIndices(s);
        System.out.println(indices[0] + " " + indices[1]);
    }

    private static int[] findIndices(String s) {
        int[] indices = new int[2];
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                indices[0] = i + 1;
                indices[1] = i + 2;
                break;
            }
        }
        if (indices[0] == 0 && indices[1] == 0) {
            for (int i = 0; i < s.length() - 2; i++) {
                if (s.charAt(i) == s.charAt(i + 2)) {
                    indices[0] = i + 1;
                    indices[1] = i + 3;
                    break;
                }
            }
        }
        if (indices[0] == 0 && indices[1] == 0) {
            indices[0] = -1;
            indices[1] = -1;
        }
        return indices;
    }
}
```
This code uses a `Scanner` to read a line of input from the user, and then calls the `findIndices` method to find the indices of the first two consecutive characters in the string that are the same. If no such characters are found, the method returns an array with both elements set to `-1`.

The `findIndices` method uses a nested loop to iterate over the characters in the string, and checks if the current character is the same as the next character. If it is, the method returns an array with the indices of the two characters. If no such characters are found, the method returns an array with both elements set to `-1`.

The `main` method then prints the indices of the first two consecutive characters in the string that are the same, or `-1 -1` if no such characters are found.</s>
