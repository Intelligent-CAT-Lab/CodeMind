Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        String A = input[0];
        String x = input[1];
        String C = input[2];
        
        System.out.println("A" + x.charAt(0) + "C");
        
        scanner.close();
    }
}
```

In the above Java code, a `Scanner` object is used to read a line from standard input, and we split the line into an array of `Strings` using the `split` method with a space as the delimiter. We then extract the first character from the second string (`x`) using the `charAt` method and concatenate the characters as required to form the "AC" output. Finally, we close the `Scanner` object to prevent resource leaks.
