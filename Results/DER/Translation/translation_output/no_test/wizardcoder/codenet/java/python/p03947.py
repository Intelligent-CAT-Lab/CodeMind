Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03947 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        char[] input_char = input.toCharArray();
        
        char current_char = input_char[0];
        int count = 0;
        for (int i=1;i<input_char.length;i++) {
            if (input_char[i]!=current_char) {
                count++;
                current_char = input_char[i];
            }
        }
        
        System.out.println(count);
    }
}

```

### Response:
```python
import java.util.Scanner;

public class p03947 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        char[] input_char = input.toCharArray();
        
        char current_char = input_char[0];
        int count = 0;
        for i in range(1, len(input_char)):
            if input_char[i]!= current_char:
                count += 1
                current_char = input_char[i]
        
        System.out.println(count)
    }
}
```

Explanation:

- We first import the `java.util.Scanner` class to read input from the user.
- We then create a `Scanner` object to read input from the user.
- We read the input string from the user using the `nextLine()` method of the `Scanner` class.
- We convert the input string to a character array using the `toCharArray()` method of the `String` class.
- We initialize the `current_char` variable to the first character of the input string.
- We initialize the `count` variable to 0.
- We loop through the input string using a `for` loop and check if the current character is different from the `current_char`. If it is, we increment the `count` variable and update the `current_char` variable to the current character.
- Finally, we print the `count` variable to the console.<|endoftext|>
