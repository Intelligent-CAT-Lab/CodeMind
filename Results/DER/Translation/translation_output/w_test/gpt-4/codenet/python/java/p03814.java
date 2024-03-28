Here is the Java translation of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a_index = 0;
        int z_index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a_index = i;
                break;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'Z') {
                z_index = i;
                break;
            }
        }
        
        System.out.println(z_index - a_index + 1);
        scanner.close();
    }
}
```

You can use the above Java program to input a string and it will output the result just like the Python code does. The program reads an input string from the console and then calculates the desired output by finding the positions of the first occurrence of 'A' and the last occurrence of 'Z', before printing the difference between the two indices inclusive.
