<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<String> ar = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ar.add("#");
        }
        for (int i = 0; i < 100; i++) {
            ar.add(".");
        }
        for (int i = 0; i < 50; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < 100; j++) {
                temp.add("#");
            }
            ar.add(temp);
            for (int j = 0; j < 100; j++) {
                temp.add(".");
            }
            ar.add(temp);
        }
        for (int i = 48; i >= 0; i -= 2) {
            if (count == a - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar.get(i).set(j, ".");
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar.get(i).set(j, ".");
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            }
        }
        for (int i = 99; i >= 50; i -= 2) {
            if (count == b - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar.get(i).set(j, "#");
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar.get(i).set(j, "#");
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            }
        }
        for (List<String> row : ar) {
            System.out.println(row.stream().mapToObj(String::valueOf).reduce("", (a, b) -> a + b));
        }
    }
}
```</s>
