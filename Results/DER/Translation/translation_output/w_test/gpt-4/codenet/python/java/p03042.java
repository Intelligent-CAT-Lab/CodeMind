Below is the translated Java code from the provided Python code. I'm assuming that the input will be passed as an argument to the `main` method of a class named `DateFormatChecker`.

```java
public class DateFormatChecker {

    public static void main(String[] args) {
        String n = args[0];

        int a = Integer.parseInt(n.substring(0, 2));
        int b = Integer.parseInt(n.substring(2));
        if (b == 0 || b > 12) {
            if (1 <= a && a <= 12) {
                System.out.println("MMYY");
            } else {
                System.out.println("NA");
            }
        } else if (1 <= a && a <= 12) {
            System.out.println("AMBIGUOUS");
        } else {
            System.out.println("YYMM");
        }
    }
}
```

To compile and run this Java program, you would save it in a file called `DateFormatChecker.java`, compile it with `javac DateFormatChecker.java`, and then run it using, `java DateFormatChecker 1905`. The output, as expected, would be `YYMM`.
