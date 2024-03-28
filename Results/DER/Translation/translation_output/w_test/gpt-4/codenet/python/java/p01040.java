Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();
        
        int qq = y1 / 400;
        y1 %= 400;
        y1 += 400;
        qq--;

        int q = (y2 - y1) / 400;
        y2 -= 400 * q;
        int a = 688 * (q - qq);

        Calendar d = new GregorianCalendar(y1, m1 - 1, d1); // Month is 0-based in Calendar
        Calendar end = new GregorianCalendar(y2, m2 - 1, d2);

        while (d.compareTo(end) <= 0) {
            if (d.get(Calendar.DAY_OF_MONTH) == 13 && d.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                a++;
            }
            d.add(Calendar.DAY_OF_MONTH, 1);
        }

        System.out.println(a);
        scanner.close();
    }
}
```

To compile and run the Java program, you should save it to a file named `Main.java` and then use the Java compiler `javac Main.java` to compile it. After compilation, you can run the program using `java Main` and then input your test dates when prompted.

This code reads the date intervals from the standard input, calculates the number of 13th Fridays within the given intervals, and then prints the result to the standard output.
