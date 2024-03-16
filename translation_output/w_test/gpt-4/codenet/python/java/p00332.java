Below is the translated Java code:

```java
import java.util.Scanner;

public class EraCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int E = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.close();
        
        if (E == 0) {
            if (Y < 1912) {
                System.out.println("M" + (Y - 1867));
            } else if (Y < 1926) {
                System.out.println("T" + (Y - 1911));
            } else if (Y < 1989) {
                System.out.println("S" + (Y - 1925));
            } else {
                System.out.println("H" + (Y - 1988));
            }
        } else if (E == 1) {
            System.out.println(1867 + Y);
        } else if (E == 2) {
            System.out.println(1911 + Y);
        } else if (E == 3) {
            System.out.println(1925 + Y);
        } else {
            System.out.println(1988 + Y);
        }
    }
}
```

To compile and run the code, save the code in a file named `EraCalculator.java`. Compile the file with `javac EraCalculator.java`, and then execute the program with `java EraCalculator`. Input the test case `0 2015` and you should see the expected output `H27`.
