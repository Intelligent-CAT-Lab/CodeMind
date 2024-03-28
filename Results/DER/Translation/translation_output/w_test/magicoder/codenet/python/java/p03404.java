<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
3 3
##.
..#
#.#


```
a,b = map(int,input().split(" "))
ar = []
for i in range(50):
    l = ["#" for j in range(100)]
    ar.append(l)
for i in range(50):
    l = ["." for j in range(100)]
    ar.append(l)
print(100,100)
count = 0
for i in range(48,-1,-2):
    if count == a-1:
        break
    if i % 2 == 0:
        for j in range(0,100,2):
            ar[i][j] = "."
            count += 1
            if count == a-1:
                break
    else:
        for j in range(1,100,2):
            ar[i][j] = "."
            count += 1
            if count == a-1:
                break
count = 0
for i in range(99,50,-2):
    if count == b-1:
        break
    if i % 2 == 0:
        for j in range(0,100,2):
            ar[i][j] = "#"
            count += 1
            if count == b-1:
                break
    else:
        for j in range(1,100,2):
            ar[i][j] = "#"
            count += 1
            if count == b-1:
                break
for r in ar:
    print("".join(r))
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        String[][] ar = new String[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                ar[i][j] = "#";
            }
        }

        int count = 0;
        for (int i = 48; i >= 0; i -= 2) {
            if (count == a - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar[i][j] = ".";
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar[i][j] = ".";
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            }
        }

        count = 0;
        for (int i = 99; i >= 50; i -= 2) {
            if (count == b - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar[i][j] = "#";
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar[i][j] = "#";
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            }
        }

        System.out.println(100 + " " + 100);
        for (String[] row : ar) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, then creates a 100x100 grid of "#" characters. It then modifies the grid to create the desired pattern. Finally, it prints the grid.<｜end▁of▁sentence｜>
