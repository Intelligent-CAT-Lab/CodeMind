Certainly! Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int countO = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                countO++;
            }
        }
        
        int result = 700 + 100 * countO;
        System.out.println(result);
    }
}
```

To use this Java code, you would need to create a class named `Main`, or whatever you decide to name your class. Remember that in Java, the input is read through a `Scanner` object, and we manually count the occurrences of 'o' in the given string since Java does not have the `count` method that Python strings do. Then we print out the result which is `700 + 100` times the count of 'o'.
