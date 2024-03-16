Here is the translated version of your Python code into Java:

```java
import java.util.Scanner;

public class QuestionToD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] aArray = a.toCharArray(); // convert string to char array

        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i] == '?') {
                aArray[i] = 'D';
            }
        }

        String b = "";
        for (int i = 0; i < aArray.length; i++) {
            b += aArray[i]; // concatenate characters back to string
        }

        System.out.println(b);

        scanner.close(); // close the scanner to prevent resource leak
    }
}
```

The Java version uses `Scanner` to read input from the user and converts the input string into a character array for processing. It iterates over the array to replace the question marks with 'D', then constructs the output string by concatenating the characters of the array. Finally, it prints the result.
