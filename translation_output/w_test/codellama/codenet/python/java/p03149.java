<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 7 9 4

Expected output:
YES


```
a = sorted(list(int(i) for i in input().split()) )
b = [1,4,7,9]
if a == b:
 ans ='YES'
else:
 ans ='NO'
print(ans)
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int[] sortedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sortedNumbers[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(sortedNumbers);
        int[] expectedNumbers = {1, 4, 7, 9};
        if (Arrays.equals(sortedNumbers, expectedNumbers)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it splits the input string into an array of strings using the `split()` method. It then converts each string to an integer using the `Integer.parseInt()` method and stores it in a new array. The `Arrays.sort()` method is used to sort the array of integers in ascending order. Finally, the `Arrays.equals()` method is used to compare the sorted array with the expected array of integers, and if they are equal, it prints "YES" to the console, otherwise it prints "NO".</s>
