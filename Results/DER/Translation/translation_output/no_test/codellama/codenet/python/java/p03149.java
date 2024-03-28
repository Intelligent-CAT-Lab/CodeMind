<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a = sorted(list(int(i) for i in input().split()) )
b = [1,4,7,9]
if a == b:
 ans ='YES'
else:
 ans ='NO'
print(ans)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

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
        int[] b = {1, 4, 7, 9};
        if (Arrays.equals(sortedNumbers, b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `Arrays.sort()` method to sort the array of integers. The `Arrays.equals()` method is used to compare the sorted array with the array `b`.</s>
