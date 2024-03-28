<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] ar = new int[100][100];
        Arrays.fill(ar, 0);
        for (int i = 0; i < 50; i++) {
            Arrays.fill(ar[i], '#');
        }
        for (int i = 0; i < 50; i++) {
            Arrays.fill(ar[i], '.');
        }
        System.out.println(a + " " + b);
        int count = 0;
        for (int i = 48; i >= 2; i -= 2) {
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
        for (int i = 99; i >= 2; i -= 2) {
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
        for (int[] row : ar) {
            System.out.println(Arrays.toString(row));
        }
    }
}
```</s>
