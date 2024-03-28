
```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
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

Chef has a dice with **N** faces numbered from **1** to **N**. The faces are arranged in a row.

Chef wants to rearrange the faces in such a way that the sum of the numbers on the top faces of the dice is equal to **M**.

Help Chef to find the number of ways to do so. As the answer can be large, output it modulo **109+7**.

### Input

The first line of the input contains an integer **T** denoting the number of test cases. The description of **T** test cases follows.

The first line of each test case contains two space-separated integers **N** and **M**.

### Output

For each test case, output a single line containing the answer.

### Constraints

- **1** ≤ **T** ≤ **105**
- **1** ≤ **N** ≤ **109**
- **1** ≤ **M** ≤ **109**
- **M** ≤ **N**

### Example

```
<b>Input:</b>
<tt>2
3 3
4 6</tt>

<b>Output:</b>
<tt>1
2</tt>
```

### Explanation

**Example case 1.** There is only one way to rearrange the faces: **1**, **2**, **3**.

**Example case 2.** There are two ways to rearrange the faces: **1**, **2**, **3**, **4** and **1**, **3**, **2**, **4**.

### Solution

```python
t=int(input())
for term in range(t):
    n,m=map(int,input().split())
    if(m>n):
        print(0)
    else:
        print(1)
```
/Codechef/Beginner/Chef and Strings.md
# Chef and Strings

Chef has a string **S** consisting of lowercase English characters. Chef defined functions **left shift** and **right shift** as follows.

- **left shift('a') = 'b'**
- **left shift('z') = 'a'**
- **left shift(c) = chr(ord(c) + 1)** if **c** ≠ 'a' and **c** ≠ 'z'
- **right shift('a') = 'z'**
- **right shift('z') = 'a'**
- **right shift(c) = chr(ord(c) - 1)** if **c** ≠ 'a' and **c** ≠ 'z'

Chef defined functions **left shift(S)** and **right shift(S)** as follows.

- **left shift(S) = left shift(S[1]) + left shift(S[2]) + ... + left shift(S[|S|])**
- **right shift(S) = right shift(S[1]) + right shift(S[2]) + ... + right shift(S[|S|])**

Here, **S[i]** denotes the **i**-th character of string **S**, and **|S|** denotes the length of string **S**.

Chef wants to calculate the string **left shift(right shift(S))**. Help him to do so.

### Input

- The first line of the input contains a single integer **T** denoting the number of test cases. The description of **T** test cases follows.
- The first and only line of each test case contains a single string **S**.

### Output

For each test case, print a single line containing one string — the string **left shift(right shift(S))**.

### Constraints

- **1** ≤ **T** ≤ **100**
- **1** ≤ **|S|** ≤ **105**
- **S** contains only lowercase English letters

### Example

```
<b>Input:</b>

3
abcd
abba
z

<b>Output:</b>

zabc
zabb
y
```

### Explanation

**Example case 1:** **left shift(right shift("abcd")) = "zabc"**

**Example case 2:** **left shift(right shift("abba")) = "zabb"**

**Example case 3:** **left shift(right shift("z")) = "y"**

### Solution

```python
t=int(input())
for term in range(t):
    s=input()
    s=s[::-1]
    for i in range(len(s)):
        if(s[i]=='a'):
            s=s[:i]+'z'+s[i+1:]
        elif(s[i]=='z'):
            s=s[:i]+'a'+s[i+1:]
        else:
            s=s[:i]+chr(ord(s[i])-1)+s[i+1:]
    print(s)
```
/Codechef/Beginner/Chef and Division 3.md
# Chef and Division 3

Chef has a sequence **A1,A2,…,AN**. He wants to find the number of pairs of indices **(i,j)** such that **1≤i<j≤N** and **Ai+Aj** is divisible by **3**.

### Input

- The first line of the input contains a single integer **T** denoting the number of test cases. The description of **T** test cases follows.
- The first line of each test case contains a single inte

```python
t=int(input())
for term in range(t):
    n=int(input())
    a=list(map(int,input().split()))
    c1=0
    c2=0
    c3=0
    for i in range(n):
        if(a[i]%3==0):
            c3+=1
        elif(a[i]%3==1):
            c1+=1
        else:
            c2+=1
    print(c1*c2+c3*(
