<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
YES


```
S=input()
b=S.replace("A","")=="KIHBR"
if b:
    L=list(map(len, "".join("*" if s!="A" else s for s in S).split("*")))
    X=[1,0,0,1,1,1,1]
    b&=all(L[i]<=X[i] for i in range(len(L)))
print("YNEOS"[not b::2])
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "NO";

        if (input.replace("A", "").equals("KIHBR")) {
            String[] splitInput = input.split("");
            int[] lengths = new int[splitInput.length];
            for (int i = 0; i < splitInput.length; i++) {
                lengths[i] = splitInput[i].length();
            }
            int[] expectedLengths = {1, 0, 0, 1, 1, 1, 1};
            boolean allLengthsValid = true;
            for (int i = 0; i < lengths.length; i++) {
                if (lengths[i] > expectedLengths[i]) {
                    allLengthsValid = false;
                    break;
                }
            }
            if (allLengthsValid) {
                output = "YES";
            }
        }

        System.out.println(output);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. It then checks if the input string is equal to "KIHBR" after removing all occurrences of "A". If it is, it splits the input string into individual characters and calculates the length of each character. It then checks if the length of each character is less than or equal to the corresponding element in the `expectedLengths` array, which is defined as {1, 0, 0, 1, 1, 1, 1}. If all lengths are valid, the output is set to "YES", otherwise it is set to "NO". Finally, the output is printed to the console.</s>
