Here is the Python code translated to Java:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        cutRibbon();
    }
    
    public static void cutRibbon() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        int length = arr[0];
        arr = Arrays.copyOfRange(arr, 1, 4);
        Arrays.sort(arr);
        
        if (length % arr[0] == 0) {
            System.out.println(length / arr[0]);
            return;
        }
        
        int ans = 0;
        if (arr[0] == arr[1]) {
            int k = 0;
            for (int i = 0; i <= length / arr[2]; i++) {
                int check = length - i * arr[2];
                if (check >= 0 && check % arr[0] == 0) {
                    k = check / arr[0];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            int k = 0;
            for (int i = 0; i <= length / arr[2]; i++) {
                for (int j = 0; j <= length / arr[1]; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
}
```

To use the above Java code, simply create a file with an appropriate class name (for example, `Main.java`), paste the provided Java code inside it, and compile and run it using a Java development environment or command-line tool. Make sure to input the values in the console when prompted by the program.
