Certainly! Here's the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        String w = scanner.nextLine();
        boolean isEven = true;

        for (int i = 0; i < alfa.length(); i++) {
            int count = 0;
            for (int j = 0; j < w.length(); j++) {
                if (alfa.charAt(i) == w.charAt(j)) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                isEven = false;
                System.out.println("No");
                return;
            }
        }
        
        if (isEven) {
            System.out.println("Yes");
        }
        scanner.close();
    }
}
```

To run this code, you can place it in a file named `Main.java`, compile it with `javac Main.java`, and then run it with `java Main`. When prompted, enter the test string, and the program will output whether all characters occur an even number of times.

Please note that Java is a statically typed language, and I've added a required import (`java.util.Scanner`) for reading input from stdin, as well as a main method which is the entry point for a Java application. The logic within the main method reflects the behavior described in the Python code: it checks that each letter in the alphabet (`alfa`) occurs an even number of times in the input string `w`. If any letter occurs an odd number of times, it prints "No" and exits to simulate the Python `exit()` function. If all letters occur an even number of times, it prints "Yes".
