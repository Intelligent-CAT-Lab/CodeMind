System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 B

Expected output:
+-+
|B|
+-+


```
w,h,c=input().split(" ")
w=int(w)
h=int(h)
print("+"+"-"*(w-2)+"+")
for i in range(h-2):
    if i*2==h-3:
        print("|"+"."*((w-3)//2)+c+"."*((w-3)//2)+"|")
    else:
        print("|"+"."*(w-2)+"|")
print("+"+"-"*(w-2)+"+")

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int width = Integer.parseInt(input[0]);
        int height = Integer.parseInt(input[1]);
        char c = input[2].charAt(0);

        System.out.println("+".repeat(width) + "+");
        for (int i = 0; i < height - 2; i++) {
            if (i * 2 == height - 3) {
                System.out.println("|" + ".".repeat((width - 3) / 2) + c + ".".repeat((width - 3) / 2) + "|");
            } else {
                System.out.println("|" + ".".repeat(width - 2) + "|");
            }
        }
        System.out.println("+".repeat(width) + "+");
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
        Main.main(new String[]{"3", "3", "B"});
        String expected = "+---+\n" +
                "|B  |\n" +
                "+---+\n";
        assertEquals(expected, getOutput());
    }

    @Test
    public void test2() {
        Main.main(new String[]{"5", "3", "A"});
        String expected = "+-----+\n" +
                "|A    |\n" +
                "|     |\n" +
                "+-----+\n";
        assertEquals(expected, getOutput());
    }

    private String getOutput() {
        // Implement a method to capture the output of the program
        // For example, you can use a StringBuilder to store the output
        // and return it as a string.
        return "";
    }
}
```<|endoftext|>
