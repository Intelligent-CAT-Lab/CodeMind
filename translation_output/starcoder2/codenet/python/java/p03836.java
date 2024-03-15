
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        int x = (tx-sx);
        int y = (ty-sy);
        String order = "L";
        order += "U".repeat(y+1);
        order += "R".repeat(x+1);
        order += "D";
        order += "R";
        order += "D".repeat(y+1);
        order += "L".repeat(x+1);
        order += "U";
        order += "U".repeat(y);
        order += "R".repeat(x);
        order += "D".repeat(y);
        order += "L".repeat(x);
        System.out.println(order);
    }
}
```

## 10. [The Minion Game](https://www.hackerrank.com/challenges/the-minion-game/problem)

Kevin and Stuart want to play the 'The Minion Game'.

Game Rules

Both players are given the same string, .
Both players have to make substrings using the letters of the string .
Stuart has to make words starting with consonants.
Kevin has to make words starting with vowels.
The game ends when both players have made all possible substrings.

Scoring
A player gets +1 point for each occurrence of the substring in the string .

For Example:
String  = BANANA
Kevin's vowel beginning word = ANA
Here, ANA occurs twice in BANANA. Hence, Kevin will get 2 Points.

For better understanding, see the image below:

![image](https://s3.amazonaws.com/hr-challenge-images/9693/1450330231-4476048683-banana.png)

Your task is to determine the winner of the game and their score.

Input Format

A single line of input containing the string .
Note: The string  will contain only uppercase letters: .

Constraints

Output Format

Print one line: the name of the winner and their score separated by a space.

If the game is a draw, print Draw.

Sample Input

```
BANANA
```

Sample Output

```
Stuart 12
```

Note :
Vowels are only defined as . In this problem,  is not considered a vowel.

## 11. [Merge the Tools!](https://www.hackerrank.com/challenges/merge-the-tools/problem)

Consider the following:

A string, , of length  where .
An integer, , where  is a factor of .
We can split  into  subsegments where each subsegment, , consists of a contiguous block of  characters in . Then, use each  to create string  such that:

The characters in  are a subsequence of the characters in .
Any repeat occurrence of a character is removed from the string such that each character in  occurs exactly once. In other words, if the character at some index  in  occurs at a previous index  in , then do not include the character in string .
Given  and , print  lines where each line  denotes string .

Input Format

The first line contains a single string denoting .
The second line contains an integer, , denoting the length of each subsegment.

Constraints

, where  is the length of
It is guaranteed that  is a multiple of .
Output Format

Print  lines where each line  contains string .

Sample Input

```
AABCAAADA
3   
```

Sample Output

```
AB
CA
AD
```

Explanation

String  is split into  equal parts of length . We convert each  to  by removing any subsequent occurrences non-distinct characters in :

We then print each  on a new line.

## 12. [Introduction to Sets](https://www.hackerrank.com/challenges/py-introduction-to-sets/problem)

### Task

Now, let's use our knowledge of sets and help Mickey.

Ms.  is a botany professor at District College. One day, she asked her student Mickey to compute the average of all the plants with distinct heights in her greenhouse.

Formula used:

![image](https://s3.amazonaws.com/hr-challenge-images/0/1486111662-626546174a-set-avg.png)

Function Description

Complete the average function in the editor below.

average has the following parameters:

int arr: an array of integers
Returns

float: the resulting float value rounded to 3 places after the decimal
Input Format

The first line contains the integer, , the size of .
The second line contains  space-separated integers, .

Constraints

Output Format

Output the average height value on a single line.

Sample Input

```
10
161 182 161 154 176 170 167 171 170 174
```

Sample Output

```
169.375
```

Explanation

![image](https://s3.amazonaws.com/hr-challenge-images/0/1486111702-626546174a-set-avg-fig.png)

The sum of all the heights is .
There are  distinct heights.
Hence, the average is .

## 13. [No Idea!](https://www.hackerrank.com/challenges/no-idea/problem)

There is an array of  integers. There are also  disjoint sets,  and , each containing  integers. You like all the integers in set  and dislike all the integers in set . Your initial happiness is . For each  integer in the array, if , you add  to your happiness. If , you add  to your happiness. Otherwise, your happiness does not change. Output your final happiness at the end.

Note: Since  and  are sets, they have no repeated elements. However, the array might contain duplicate elements.

Constraints

Input Format

The first line contains integers  and  separated by a space.
The second line contains  integers, the elements of the array.
The third and fourth lines contain  integers,  and , respectively.

Output Format

Output a single integer, your total happiness.

Sample Input

```
3 2
1 5 3
3 1
5 7
```

Sample Output

```
1
```

Explanation

You gain  unit of happiness for elements  and  in set . You lose  unit for  in set . The element  in set  does not exist in the array so it is not included in the calculation.

Hence, the total happiness is .

## 14. [Symmetric Difference](https://www.hackerrank.com/challenges/symmetric-difference/problem)

Given  sets of integers,  and , print their symmetric difference in ascending order. The term symmetric difference indicates those values that exist in either  or  but do not exist in both.

Input Format

The first line of input contains an integer, .
The next  lines each contain an integer, .
The last line of input contains an integer, .
The next  lines each contain an integer, .

Constraints

Output Format

Output the symmetric difference integers in ascending order, one per line.

Sample Input

```
4
2
4
5
9
4
2
3
5
9
```

Sample Output

```
3
4
5
9
```

Explanation

The symmetric difference of set  and set  is set .

## 15. [Set .add()](https://www.hackerrank.com/challenges/
