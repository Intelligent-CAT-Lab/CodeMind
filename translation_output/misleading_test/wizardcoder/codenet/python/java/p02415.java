Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
fAIR, LATER, OCCASIONALLY CLOUDY.

Expected output:
Fajir, lateY,?VcWyqcuaJ8$ cloudy

```
s = input()
print(s.swapcase())

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += c;
            }
        }
        System.out.println(result);
    }
}
```

Explanation:

- We first import the Scanner class from the java.util package to read input from the user.
- We then create a new Scanner object to read input from the user.
- We read the input string from the user using the nextLine() method of the Scanner class.
- We create an empty string variable called result to store the modified string.
- We loop through each character of the input string using a for loop.
- For each character, we check if it is uppercase or lowercase using the isUpperCase() and isLowerCase() methods of the Character class.
- If the character is uppercase, we convert it to lowercase using the toLowerCase() method of the Character class and append it to the result string.
- If the character is lowercase, we convert it to uppercase using the toUpperCase() method of the Character class and append it to the result string.
- If the character is neither uppercase nor lowercase, we simply append it to the result string.
- Finally, we print the modified string using the println() method of the System.out object.<|endoftext|>
