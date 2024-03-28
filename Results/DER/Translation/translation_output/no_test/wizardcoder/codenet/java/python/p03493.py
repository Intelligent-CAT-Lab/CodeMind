Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

class p03493 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int marbles = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1')marbles++;
        }
        System.out.println(marbles);
    }
}

```

### Response:
```python
import java.util.Arrays
import java.util.Scanner

class p03493:

    def main(self):
        scanner = Scanner(System.in)
        a = scanner.next()
        marbles = 0
        for i in range(a.length()):
            if a.charAt(i) == '1':
                marbles += 1
        print(marbles)

p03493().main()
```

Explanation:

- We first import the necessary classes from the java package.
- We define a class `p03493` which contains a method `main` which is the entry point of the program.
- Inside the `main` method, we create a `Scanner` object to read input from the user.
- We read the input string `a` from the user using the `next` method of the `Scanner` class.
- We initialize a variable `marbles` to 0 which will store the number of marbles in the string `a`.
- We loop through each character of the string `a` using a `for` loop and check if the character is equal to '1'. If it is, we increment the `marbles` variable by 1.
- Finally, we print the value of `marbles` which represents the number of marbles in the string `a`.<|endoftext|>
