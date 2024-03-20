Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
apple

Expected output:
DmdZQr

```
import java.util.Scanner;

public class p02546 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       String s = sc.next();
       if (s.endsWith("s")) {
           System.out.println(s + "es");
       } else {
           System.out.println(s + "s");
       }



    }

}

```

### Response:
```python
import java.util.Scanner;

public class p02546 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       String s = sc.next();
       if (s.endsWith("s")) {
           System.out.println(s + "es");
       } else {
           System.out.println(s + "s");
       }
    }

}
```

The above code is a simple program that takes input from the user and checks if the input ends with the letter "s". If it does, it adds the letter "es" to the input string. If it doesn't, it adds the letter "s" to the input string. The output is then printed to the console.

In Python, we can achieve the same functionality using the `endswith()` method to check if a string ends with a particular substring. We can then use string concatenation to add the appropriate suffix to the input string. Here's the equivalent Python code:

```python
import java.util.Scanner;

def main():
    sc = Scanner(System.in)
    s = sc.nextLine()
    if s.endswith("s"):
        print(s + "es")
    else:
        print(s + "s")

if __name__ == "__main__":
    main()
```

In this code, we first import the `Scanner` class from the `java.util` package. We then define a `main()` function that reads input from the user using the `Scanner` class and stores it in the `s` variable. We then use the `endswith()` method to check if `s` ends with the letter "s". If it does, we add the letter "es" to `s` using string concatenation. If it doesn't, we add the letter "s" to `s` using string concatenation. Finally, we print the resulting string to the console using the `print()` function.

Note that we use the `nextLine()` method of the `Scanner` class instead of the `next()` method to read input from the user. This is because the `nextLine()` method reads the entire line of input including any trailing newline characters, whereas the `next()` method reads only the next token of input, which may not include the entire line.<|endoftext|>
