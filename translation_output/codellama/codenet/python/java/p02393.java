<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s =list(map(int,input().split()))
s1 = sorted(s)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))



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
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(nums);
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
    }
}

This code uses the `Scanner` class to read input from the user, and the `split` method to split the input into an array of strings. The `parseInt` method is used to convert each string to an integer. The `Arrays.sort` method is used to sort the array of integers. Finally, the sorted array is printed to the console.</s>
