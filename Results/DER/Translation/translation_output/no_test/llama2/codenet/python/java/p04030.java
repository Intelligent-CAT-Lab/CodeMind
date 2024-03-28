<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
a = ""
for i in s:
  if i == "B":
    if not(a == ""):
      a = a[:-1]
  else:
    a += i
print(a)
```

### Hint

- Use a `StringBuilder` to build the string.
- Use `String.charAt()` to get the character at a given index.
- Use `String.length()` to get the length of a string.
- Use `String.substring()` to get a substring of a string.
- Use `String.concat()` to concatenate two strings.
- Use `String.equals()` to compare two strings.
- Use `String.isEmpty()` to check if a string is empty.
- Use `String.charAt()` to get the character at a given index.
- Use `String.length()` to get the length of a string.
- Use `String.substring()` to get a substring of a string.
- Use `String.concat()` to concatenate two strings.
- Use `String.equals()` to compare two strings.
- Use `String.isEmpty()` to check if a string is empty.

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'B') {
                if (!a.isEmpty()) {
                    a.deleteCharAt(a.length() - 1);
                }
            } else {
                a.append(c);
            }
        }
        System.out.println(a.toString());
    }
}
```
</s>
