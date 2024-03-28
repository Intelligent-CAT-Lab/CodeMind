<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:
A


```
S = list(map(int,input().split()))
if S.index(max(S)) == 0:
    print("A")
elif S.index(max(S)) == 1:
    print("B")
elif S.index(max(S)) == 2:
    print("C")

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] scores = input.split(" ");
        int[] scoresArray = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            scoresArray[i] = Integer.parseInt(scores[i]);
        }
        int maxScore = scoresArray[0];
        int maxScoreIndex = 0;
        for (int i = 1; i < scoresArray.length; i++) {
            if (scoresArray[i] > maxScore) {
                maxScore = scoresArray[i];
                maxScoreIndex = i;
            }
        }
        switch (maxScoreIndex) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
```
This code first reads the input from the user, splits it into an array of strings using the `split()` method, and then converts each string to an integer using the `parseInt()` method. It then finds the maximum value in the array and its index using a for loop, and then uses a switch statement to print the corresponding letter based on the index.

Note that this code assumes that the input will always be in the format "1000 900 850", with three integers separated by spaces. If the input format is different, the code may not work correctly.</s>
