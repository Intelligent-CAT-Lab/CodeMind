<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

S=input()
a=["dream","dreamer","erase","eraser","dreamerase","dreameraser"]

numlist=[0,0,0,0,0,0]
for i in range(len(a)):
    numlist[i]=S.count(a[i])
numlist[0]-=numlist[1]
numlist[2]-=numlist[3]
numlist[4]-=numlist[5]
numlist[1]-=(numlist[4]+numlist[5])   #èª¤ã£ã¦dreamerã§æ°ããåã
numlist[0]+=(numlist[4]+numlist[5])   #dreamã«è¨ä¸ããªãã
total=numlist[0]*5+numlist[1]*7+numlist[2]*5+numlist[3]*6
if total==len(S):
    print("YES")
else:
    print("NO")


Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] a = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};

        int[] numList = new int[6];
        for (int i = 0; i < a.length; i++) {
            numList[i] = S.length() - S.replace(a[i], "").length();
        }
        numList[0] -= numList[1];
        numList[2] -= numList[3];
        numList[4] -= numList[5];
        numList[1] -= (numList[4] + numList[5]);
        numList[0] += (numList[4] + numList[5]);
        int total = numList[0] * 5 + numList[1] * 7 + numList[2] * 5 + numList[3] * 6;
        if (total == S.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The code first defines an array of strings `a` that contains the words "dream", "dreamer", "erase", "eraser", "dreamerase", and "dreameraser". It then defines an array of integers `numList` that will store the number of occurrences of each word in the input string.

The code then uses a `for` loop to iterate over the array of words `a`, and for each word, it calculates the number of occurrences of that word in the input string using the `length()` method and the `replace()` method. The `replace()` method is used to remove all occurrences of the current word from the input string, and the difference between the length of the input string and the length of the string after removing all occurrences of the current word is the number of occurrences of that word.

The code then subtracts the number of occurrences of the word "dreamer" from the number of occurrences of the word "dream", and the number of occurrences of the word "eraser" from the number of occurrences of the word "erase". It also subtracts the number of occurrences of the word "dreameraser" from the number of occurrences of the word "dreamerase".

The code then calculates the total number of occurrences of all the words in the input string by multiplying the number of occurrences of each word by a weight factor, and checks if the total number of occurrences is equal to the length of the input string. If it is, the code prints "YES", otherwise it prints "NO".</s>
