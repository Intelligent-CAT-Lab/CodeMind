Here's your Python code translated to Java:

```java
import java.util.Scanner;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        char[][] ar = new char[100][100];
        
        // Initialize the upper half with '#'
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 100; j++) {
                ar[i][j] = '#';
            }
        }
        
        // Initialize the lower half with '.'
        for (int i = 50; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                ar[i][j] = '.';
            }
        }
        
        System.out.println("100 100");
        int count = 0;
        
        // Upper half pattern generation
        for (int i = 48; i >= 0; i -= 2) {
            if (count == a - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar[i][j] = '.';
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar[i][j] = '.';
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            }
        }
        
        count = 0;
        
        // Lower half pattern generation
        for (int i = 99; i > 50; i -= 2) {
            if (count == b - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar[i][j] = '#';
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar[i][j] = '#';
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            }
        }
        
        // Print the pattern
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
``` 

Please note that Java is a statically typed language and that the main method should be contained within a class. This code snippet assumes an environment where Java I/O is accepted, and it accounts for Java's index-based loops as opposed to Python's iterator-based loops.
