<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        char[][] ar = new char[50][100];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 100; j++) {
                ar[i][j] = '#';
            }
        }

        int count = 0;
        for (int i = 48; i >= 0; i -= 2) {
            if (count == a - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar[i][j] = '.';
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar[i][j] = '.';
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
                    ar[i][j] = '#';
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar[i][j] = '#';
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}
```
This is the Java code for the given Python code. It uses the `Scanner` class to read the input from the user, and then it creates a 2D array of characters to store the grid. The code then iterates over the rows and columns of the grid, and sets the characters based on the input. Finally, it prints the grid to the console.</s>
