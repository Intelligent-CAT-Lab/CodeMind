<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A, B = map(int, input().split())

list = [A+B, 2*A-1, 2*B-1]
print(max(list))



Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class MaxList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] list = {A+B, 2*A-1, 2*B-1};
        System.out.println(max(list));
    }

    public static int max(int[] list) {
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }
}

This code uses the `Scanner` class to read input from the user, and the `max` method to find the maximum value in the list.</s>
