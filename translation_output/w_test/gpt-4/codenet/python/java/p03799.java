Below is the translated Java code from the provided Python script:

```java
import java.util.Scanner;

public class Main {
    static int INT() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
    static int[] MI() {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        return numbers;
    }
    
    public static void main(String[] args) {
        int[] input = MI();
        int N = input[0];
        int M = input[1];
        int ans;
        
        if (2 * N <= M) {
            ans = N + (M - 2 * N) / 4;
        } else {
            ans = M / 2;
        }
        
        System.out.println(ans);
    }
}
```

Please note, unlike Python where you can keep calling `input()` to get user input repeatedly while the program is running, in Java, you should typically avoid creating multiple `Scanner` objects for the same input stream (e.g., `System.in`). The given translation assumes reading operations (`INT()` and `MI()`) are happening at the appropriate times when input data is available and not mixing `Scanner.nextInt` with `Scanner.nextLine` without proper handling can cause problems due to leftover newline characters. A single `Scanner` instance should be used, and you should manage user input more carefully. In a well-structured Java program, you would likely want to do all of your input reading in a single place, possibly in the `main` method or another dedicated method for handling user input.
