Below is the translation of the Python code into Java, encapsulating the logic in a function that reads input from the standard input stream:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] i = new int[5];
        
        // Reading the 5 integers from input
        for (int idx = 0; idx < i.length; idx++) {
            i[idx] = sc.nextInt();
        }
        
        if (i[2] + i[4] <= i[0]) {
            if (i[2] - i[4] >= 0) {
                if (i[3] + i[4] <= i[1]) {
                    if (i[3] - i[4] >= 0) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
```

To compile and run this Java program, simply write it into a file named `Main.java`, then compile it with `javac Main.java`, and run it with `java Main`. When running the program, input the test case `5 4 2 2 1` to the console, and the output will be `Yes`, as expected.
