Below is the translation of the Python code into Java:

```java
import java.util.Scanner;

public class CountWBAndBW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countWBAndBW(input));
        scanner.close();
    }

    private static int countWBAndBW(String input) {
        int count = 0;
        count += countOccurrences(input, "WB");
        count += countOccurrences(input, "BW");
        return count;
    }

    private static int countOccurrences(String haystack, String needle) {
        int count = 0;
        int index = 0;
        while ((index = haystack.indexOf(needle, index)) != -1) {
            count++;
            index += needle.length();
        }
        return count;
    }
}
```

This Java code snippet does the following:
1. It imports the Scanner class for reading the user's input.
2. It defines the main method, which is the entry point of the program.
3. Inside the main method, it reads a line from the user via the Scanner class.
4. It then calls the `countWBAndBW` function with the user's input.
5. The output of the `countWBAndBW` method (which counts the occurrences of `"WB"` and `"BW"` in the input string) is printed to the console.
6. The `countOccurrences` method is used to find occurrences of a specific string ("WB" or "BW") within the input string. It loops through the string and increments the count each time the substring is found.
7. Lastly, the scanner is closed.
