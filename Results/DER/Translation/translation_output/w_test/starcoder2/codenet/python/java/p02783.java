
```java
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();
        System.out.println(Math.ceil(H/A));
    }
}
```


```

java code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] % K == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/01-warmup/01-solve-me-first/README.md
# Solve Me First

## Problem Statement

Welcome to HackerRank! The purpose of this challenge is to familiarize you with reading input from stdin (the standard input stream) and writing output to stdout (the standard output stream) using our environment.

Review the code provided in the editor below, then complete the solveMeFirst function so that it returns the sum of two integers read from stdin. Take some time to understand this code so you're prepared to write it yourself in future challenges.

Select a language below, and start coding!

## Input Format

Code that reads input from stdin is provided for you in the editor. There are 2 lines of input, and each line contains a single integer.

## Output Format

Code that prints the sum calculated and returned by solveMeFirst is provided for you in the editor.

## Sample Input

```
2
3
```

## Sample Output

```
5
```

## Explanation

The sum of the two integers  and  is computed as: .

## Solution

python code:
```python
def solveMeFirst(a,b):
    return a+b

num1 = int(input())
num2 = int(input())
res = solveMeFirst(num1,num2)
print(res)
```

java code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(solveMeFirst(num1, num2));
    }

    public static int solveMeFirst(int a, int b) {
        return a + b;
    }
}
```

# Simple Array Sum

## Problem Statement

Given an array of integers, find the sum of its elements.

## Input Format

The first line contains an integer, , denoting the size of the array.
The second line contains  space-separated integers representing the array's elements.

## Output Format

Print the sum of the array's elements as a single integer.

## Sample Input

```
6
1 2 3 4 10 11
```

## Sample Output

```
31
```

## Explanation

We print the sum of the array's elements, which is: .

## Solution

python code:
```python
n = int(input())
arr = list(map(int, input().split()))
print(sum(arr))
```

java code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

# Compare the Triplets

## Problem Statement

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .

Your task is to find their comparison points by comparing  with ,  with , and  with .

If , then Alice is awarded  point.
If , then Bob is awarded  point.
If , then neither person receives a point.
Comparison points is the total points a person earned.

Given  and , determine their respective comparison points.

## Input Format

The first line contains  space-separated integers, , , and , describing the respective values in triplet .
The second line contains  space-separated integers, , , and , describing the respective values in triplet .

## Output Format

Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

## Sample Input

```
5 6 7
3 6 10
```

## Sample Output

```
1 1
```

## Explanation

In this example:

Now, let's compare each individual score:

, so Alice receives  point.
, so nobody receives a point.
, so Bob receives  point.
Alice's comparison score is , and Bob's comparison score is . Thus, we print 1 1 (Alice's comparison score followed by Bob's comparison score) on a single line.

## Solution

python code:
```python
a = list(map(int, input().split()))
b = list(map(int, input().split()))

alice = 0
bob = 0

for i in range(len(a)):
    if a[i] > b[i]:
        alice += 1
    elif a[i] < b[i]:
        bob += 1

print(alice, bob)
```

java code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                alice++;
            } else if (a[i] < b[i]) {
                bob++;
            }
        }
        System.out.println(alice + " " + bob);
    }
}
```

# A Very Big Sum

## Problem Statement

Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

## Input Format

The first line of the input consists of an integer .
The next line contains  space-separated integers contained in the array.

## Output Format

Print the integer sum of the elements in the array.

## Constraints

## Sample Input

```
5
1000000001 1000000002 1000000003 1000000004 1000000005
```

## Output

```
5000000015
```

## Note:

The range of the 32-bit integer is .
When we add several integer values, the resulting sum might exceed the above range. You might need to use long long int in C/C++ or long data type in Java to store such sums.

## Solution

python code:
```python
n = int(input())
arr = list(map(int, input().split()))
print(sum(arr))
```

java code:
```java
import java
