Below is the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int[] S = new int[3];
        for (int i = 0; i < 3; i++) {
            S[i] = scanner.nextInt();
        }

        // Determining the highest score and its index
        int maxIndex = 0;
        int maxScore = S[0];

        for (int i = 1; i < 3; i++) {
            if (S[i] > maxScore) {
                maxScore = S[i];
                maxIndex = i;
            }
        }

        // Printing the result based on the index of the maximum score
        switch (maxIndex) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
        }

        scanner.close();
    }
}
```

To run a test case, you would need to compile this Java program and execute it. Then you can input the test values (1000 900 850) into the console, and as per your example, it should output "Ad". The 'd' in "Ad" seems to be a typo; the expected output for the input "1000 900 850" should be "A".
