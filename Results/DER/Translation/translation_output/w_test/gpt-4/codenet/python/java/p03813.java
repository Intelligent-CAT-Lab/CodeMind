Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class RatingCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a < 1200 ? "ABC" : "ARC");
        scanner.close();
    }
}
```

To execute this Java code, you'll need to compile it with `javac` and run the produced bytecode with `java`. Assuming the class is saved in a file named `RatingCategory.java`, the compilation and execution would look like this:

```bash
javac RatingCategory.java
java RatingCategory
```

Upon running, it will wait for an input. If you enter `1000`, it will print `ABC` to the console, meeting the expected output.
