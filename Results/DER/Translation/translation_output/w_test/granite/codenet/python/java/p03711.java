System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3

Expected output:
Yes


```
def main():
    x, y = map(int, input().split())
    a = [1, 3, 5, 7, 8, 10, 12]
    b = [4, 6, 9, 11]
    if x == 2 or y == 2:
        print('No')
    elif (x in a and y in a) or (x in b and y in b):
        print('Yes')
    else:
        print('No')
main()
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] a = {1, 3, 5, 7, 8, 10, 12};
        int[] b = {4, 6, 9, 11};
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if ((contains(a, x) && contains(a, y)) || (contains(b, x) && contains(b, y))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void test1() {
        Main.main(new String[]{"1", "3"});
        assertEquals("Yes", readOutput());
    }

    @Test
    public void test2() {
        Main.main(new String[]{"2", "3"});
        assertEquals("No", readOutput());
    }

    @Test
    public void test3() {
        Main.main(new String[]{"1", "2"});
        assertEquals("No", readOutput());
    }

    private String readOutput() {
        // Implement this method to read the output of the Main class
        // For example, you can use System.in or a file input stream
        // Return the output as a string
        return "";
    }
}
```<|endoftext|>
