Below is the translated Java code equivalent to the provided Python code, including the `main` method which reads the input from the command line arguments (assuming the `args` array contains the input string):

```java
public class Main {
    public static void main(String[] args) {
        String input = args[0];
        String[] parts = input.split(" ");
        
        long a = Long.parseLong(parts[0]);
        long b = Long.parseLong(parts[1]);
        long k = Long.parseLong(parts[2]);
        
        long res = a - k;
        if (res < 0) {
            a = 0;
            b += res;
            b = Math.max(b, 0);
        } else {
            a = res;
        }
        
        System.out.println(a + " " + b);
    }
}
```
This Java program converts the input string into individual parts using `split()`, parses the numbers as `long` due to the large values provided in the test case, performs the calculations, and prints the result exactly the same way as the Python code does.

Please note that to run this code with the provided test input, you would have to pass the string `1000000000000 1000000000000 1000000000000` as a command-line argument to the `Main` class. The `args[0]` will then contain this string. If you want to read input directly from the user via `System.in`, additional code would be needed to capture the input from the console.
