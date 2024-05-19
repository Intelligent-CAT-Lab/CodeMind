System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
s=input()
print(len(s)//2-s.count('p'))
```


Answer:
Here's the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                count++;
            }
        }
        System.out.println((s.length() / 2) - count);
    }
}
```

In this Java code, we first import the `Scanner` class from the `java.util` package to read input from the user. We then create a `Scanner` object named `scanner` to read input from the user.

Next, we declare a `String` variable named `s` and assign it the value of the input string.

We then declare an `int` variable named `count` and initialize it to 0. This variable will be used to count the number of occurrences of the letter 'p' in the input string.

We then use a `for` loop to iterate over each character in the input string. For each character, we check if it is equal to the letter 'p'. If it is, we increment the `count` variable by 1.

Finally, we print the result of the expression `(s.length() / 2) - count`, which is the length of the input string divided by 2 minus the number of occurrences of the letter 'p'.<|endoftext|>
