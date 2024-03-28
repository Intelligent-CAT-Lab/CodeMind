Here's the translated Java code:

```java
import java.util.Scanner;

public class ConvertCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        StringBuilder out = new StringBuilder(" ");
        int cap = 0;
        int small = 0;

        // Counting the number of uppercase and lowercase letters
        for (char t : txt.toCharArray()) {
            if (Character.isLowerCase(t)) {
                small++;
            } else {
                cap++;
            }
        }

        // Converting to either all uppercase or all lowercase
        if (small >= cap) {
            for (char t : txt.toCharArray()) {
                out.append(Character.toLowerCase(t));
            }
        } else {
            for (char t : txt.toCharArray()) {
                out.append(Character.toUpperCase(t));
            }
        }
        
        // Printing the output
        System.out.println(out);
        
        scanner.close();
    }
}
```

This Java program requires you to input a string, after which it calculates the number of uppercase and lowercase characters in the string. It then converts the entire string to lowercase if the number of lowercase characters is greater than or equal to the number of uppercase characters; otherwise, it converts the entire string to uppercase. Finally, the converted string is printed.
