Certainly! Here's the equivalent Java code for the Python snippet you provided:

```java
import java.util.Scanner;

public class RectangleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        
        int area = a * b;
        int perimeter = (a + b) * 2;
        
        System.out.println(area + " " + perimeter);
    }
}
```

Here's how you could run a test case:
- Compile the Java class using `javac RectangleCalculation.java`
- Run the program using `java RectangleCalculation`
- Input `3 5`

The expected output would be `15 16`, not just `16` as you stated in your question, because the Python code prints both the area (`a*b`) and the perimeter (`(a+b)*2`) of the rectangle separated by a space.
