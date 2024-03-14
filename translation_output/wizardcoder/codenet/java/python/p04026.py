Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p04026 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    int[] last = new int[26];
    Arrays.fill(last, -1);
    for (int i = 0; i < s.length; i++) {
      int ch = s[i] - 'a';
      if (last[ch] >= 0 && i - last[ch] < 3) {
        System.out.printf("%d %d\n", last[ch] + 1, i + 1);
        return;
      }
      last[ch] = i;
    }
    System.out.println("-1 -1");
  }
}

```

### Response:
```python
import java.util.Arrays
import java.util.Scanner

def main():
    scanner = Scanner(System.in)

    s = scanner.next().toCharArray()
    last = [-1] * 26
    for i in range(len(s)):
        ch = ord(s[i]) - ord('a')
        if last[ch] >= 0 and i - last[ch] < 3:
            print(last[ch] + 1, i + 1)
            return
        last[ch] = i

    print("-1 -1")

if __name__ == '__main__':
    main()
```

Explanation:

- We first import the necessary classes from the java package.
- We define a function called `main` which will contain the code to solve the problem.
- We create a `Scanner` object to read input from the user.
- We read the input string `s` and convert it to a character array using the `toCharArray()` method.
- We create an integer array `last` of size 26 to store the last index of each character in the string. We initialize all the elements of the array to -1.
- We loop through each character in the string using a for loop.
- For each character, we calculate its index in the `last` array using the ASCII value of the character minus the ASCII value of 'a'.
- If the last index of the character is greater than or equal to 0 and the difference between the current index and the last index is less than 3, we have found a substring of length 3 or more that starts at the last index and ends at the current index. We print the starting and ending indices of the substring and return from the function.
- If we have not found a substring of length 3 or more, we update the last index of the character in the `last` array.
- If we have looped through the entire string without finding a substring of length 3 or more, we print "-1 -1" as the output.<|endoftext|>
