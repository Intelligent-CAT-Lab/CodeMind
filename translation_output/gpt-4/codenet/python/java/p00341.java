Below is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[100];
        Scanner scanner = new Scanner(System.in);
        
        // Assuming the input is given in a single line separated by space
        String[] input = scanner.nextLine().split(" ");
        int[] b = new int[input.length];
        
        for (int i = 0; i < input.length; i++) {
            b[i] = Integer.parseInt(input[i]);
        }
        
        for (int i = 0; i < 12; i++) {
            a[b[i] - 1]++;
        }
        
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] != 0 && a[i] % 4 == 0) c += a[i] / 4;
        }
        
        System.out.println(c == 3 ? "yes" : "no");
        
        scanner.close();
    }
}
```

In this Java code, I've used a `Scanner` object to read the input from the standard input stream. Then, I split the input line by spaces to get individual numbers, which I parse as integers and store in an array `b`.

The rest of the code follows the logic of the provided Python script. The array `a` is used to count the occurrences of each number in the input list, and the variable `c` is used to count the number of groups where the count of occurrences is a multiple of 4. Finally, we print "yes" if `c` is 3; otherwise, we print "no".
