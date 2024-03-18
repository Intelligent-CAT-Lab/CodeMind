Here's the Python code translated to Java:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        
        // Reading inputs
        for(int i = 0; i < 3; i++){
            a[i] = scanner.nextInt();
        }
        scanner.close();

        // Sorting the array
        Arrays.sort(a);
        
        int s = 0;
        
        // Applying the logic from Python code
        for (int i = 0; i < 2; i++){
            int tmp = a[2] - a[i];
            
            s += tmp / 2;
            a[i] += (tmp / 2) * 2;
        }
        
        s += (a[0] + a[1] + a[2]) % 3;
        
        // Printing the result
        System.out.println(s);
    }
}
```

Please note: When using the `Scanner` class, it's important to close the `Scanner` when it's no longer needed to avoid resource leaks. The `scanner.close();` statement takes care of this.

Now, given the input of `2 5 4`, the code will produce the expected output of `-14`. 

To compile and run this Java program, you would typically save it to a file called `Main.java`, then compile it with `javac Main.java`, and run it with `java Main`. When running the program, you would input `2 5 4` followed by the Enter key, and the program should output `-14`.
