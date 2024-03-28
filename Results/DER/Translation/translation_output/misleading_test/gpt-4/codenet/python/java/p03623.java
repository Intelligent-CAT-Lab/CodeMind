Below is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class ClosestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input from user
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        // Calculating which point is closer and printing result
        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```

To compile and run the Java code with the sample test input ("5 2 7"), you can execute the following commands on your terminal or command line:

```sh
javac ClosestPoint.java
echo "5 2 7" | java ClosestPoint
```

Expected output:
```
Br
```
