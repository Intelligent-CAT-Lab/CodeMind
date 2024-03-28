Below is the translated Python code to Java. It reads two integer values, calculates the difference between them as the distance of the tower, computes the height of the tower according to the given formula, and then calculates and prints the final answer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int tower_dis = b - a;
        int b_height = tower_dis * (tower_dis + 1) / 2;
        int ans = b_height - b;

        System.out.println(ans);
    }
}
```

To compile and run the program, you would typically do the following in a terminal (assuming the file is saved as `Main.java`): 

```sh
javac Main.java
java Main
```

And then provide the test input (`8 13`) to get the expected output (`101`).
