
```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=1;
        for(int term=1;term<=t;term++)
        {
            int n=sc.nextInt();
            int div=10;
            int tot=0;
            if(n%2==1)
            {
                System.out.println(0);
            }
            else
            {
                while(n>=div)
                {
                    tot+=(n/div);
                    div*=5;
                }
                System.out.println(tot);
            }
        }
    }
}
```
/Codechef/Beginner/Chef and Dice.md
# Chef and Dice

Chef has a dice with 6 faces. Each face has a number written on it. The numbers on the faces are 1, 2, 3, 4, 5, 6.

Chef wants to rearrange the numbers on the faces in such a way that the sum of the numbers on the top two faces is equal to the sum of the numbers on the bottom two faces.

Find out if Chef can do so.

### Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains six space-separated integers A1, A2, A3, A4, A5 and A6 denoting the numbers written on the faces of the dice.

### Output

For each test case, print a single line containing the string "yes" if it is possible to rearrange the numbers on the faces in such a way that the sum of the numbers on the top two faces is equal to the sum of the numbers on the bottom two faces or "no" otherwise (without quotes).

### Constraints

- 1≤T≤100
- 1≤Ai≤100 for each valid i

### Example Input

```
3
1 2 3 4 5 6
1 2 3 4 5 1
1 2 3 4 5 2
```

### Example Output

```
yes
no
yes
```

### Explanation

Example case 1: The numbers on the top two faces are 1+2=3 and the numbers on the bottom two faces are 4+5=9.

Example case 2: It is impossible to rearrange the numbers on the faces in such a way that the sum of the numbers on the top two faces is equal to the sum of the numbers on the bottom two faces.

Example case 3: The numbers on the top two faces are 1+2=3 and the numbers on the bottom two faces are 3+4=7.

### Solution

```python
t=int(input())
for term in range(t):
    a=list(map(int,input().split()))
    if(a[0]+a[1]==a[2]+a[3] or a[0]+a[1]==a[4]+a[5] or a[0]+a[1]==a[2]+a[5] or a[0]+a[1]==a[3]+a[4] or a[0]+a[1]==a[3]+a[5] or a[0]+a[1]==a[4]+a[2]):
        print("yes")
    else:
        print("no")
```
/Codechef/Beginner/Chef and String.md
# Chef and String

Chef has a string S consisting of lowercase English characters. Chef defined functions left shift L(X) and right shift R(X) as follows.

L(X) is defined as shifting all characters of string X one step towards the left and moving the first character to the end.
R(X) is defined as shifting all characters of string X one step towards the right and moving the last character to the beginning.
For example, L("abcd") = "bcda" and R("abcd") = "dabc"

Chef wants to find out whether there exists a string V of the same length as S such that both L(V) and R(V) are equal to S.

### Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains a single string S.

### Output

For each test case, print a single line containing the string "Yes" if there exists a string V (as defined in the problem statement) or "No" otherwise (without quotes).

### Constraints

- 1≤T≤100
- 1≤|S|≤100
- S contains only lowercase English letters

### Example Input

```
3
abc
abba
ab
```

### Example Output

```
Yes
Yes
No
```

### Explanation

Example case 1: V can be, for example, "bac".

Example case 2: V can be, for example, "abba".

Example case 3: It can be shown that there does not exist any string V satisfying the constraints.

### Solution

```python
t=int(input())
for term in range(t):
    s=input()
    if(s==s[::-1]):
        print("Yes")
    else:
        print("No")
```
t(input())
for term in range(t):
    n=int(input())
    a=list(map(int,input().split()))
    a.sort()
    print(a[0]*a[n-1])
```
/Codechef/Beginner/Smallest Numbers of Notes.md
# Smallest Numbers of Notes

Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.

Calculate Pooja's account balance after an attempted transaction.

### Input

- The first line contains an integer T, the number of test cases.
- Each test case contains an integer X, the amount of cash which Pooja wishes to withdraw.

### Output

- For each test case output a single line containing the minimum amount of cash Pooja should have on her account after the attempted transaction. If there is not enough money in the account to complete the transaction, output -1 as the first and only line of output.

### Constraints

- 1 ≤ T ≤ 100
- 1 ≤ X ≤
