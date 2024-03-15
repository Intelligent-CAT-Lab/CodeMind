
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Set<Integer> setl = new HashSet<Integer>();
        setl.add(k);
        setl.add(k-1);
        for(int x=2;x<=Math.sqrt(k);x++)
        {
            check(x,k,setl);
            check(k/x,k,setl);
        }
        if(setl.contains(1))
            setl.remove(1);
        System.out.println(setl.size());
    }
    public static void check(int i,int k,Set<Integer> setl)
    {
        int tot=k;
        while(tot%i==0)
            tot/=i;
        if(tot%i==1)
            setl.add(i);
    }
}
```

## Problem 2

### Problem Statement

You are given a string S. You need to find the number of substrings of S that are palindromes.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single string S.

### Output

For each test case, print a single line containing one integer — the number of substrings of S that are palindromes.

### Constraints

1≤T≤100
1≤|S|≤105
S contains only lowercase English letters

### Example Input

```
2
abba
abcd
```

### Example Output

```
6
0
```

### Explanation

Example case 1: The palindromic substrings of the string abba are:

- a
- b
- b
- a
- bb
- abba

Example case 2: There are no palindromic substrings in the string abcd.

### Solution

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            int n = s.length();
            int count = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    if(isPalindrome(s.substring(i,j+1)))
                        count++;
                }
            }
            System.out.println(count);
        }
    }
    public static boolean isPalindrome(String s)
    {
        int n = s.length();
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
                return false;
        }
        return true;
    }
}
```
/Codechef/Codechef_Beginner/Codechef_Beginner_1.md
# Codechef Beginner

## Problem 1

### Problem Statement

You are given a sequence A1,A2,…,AN. Find the number of pairs (i,j) (1≤i<j≤N) such that Ai+Aj is a prime number.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers A1,A2,…,AN.

### Output

For each test case, print a single line containing one integer — the number of pairs (i,j) (1≤i<j≤N) such that Ai+Aj is a prime number.

### Constraints

1≤T≤100
1≤N≤105
1≤Ai≤109 for each valid i

### Example Input

```
2
5
1 2 3 4 5
3
1 2 3
```

### Example Output

```
2
0
```

### Explanation

Example case 1: The pairs (1,2), (1,3) and (2,3) satisfy the conditions.

Example case 2: No pair of numbers satisfy the conditions.

### Solution

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            int count = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(isPrime(a[i]+a[j]))
                        count++;
                }
            }
            System.out.println(count);
        }
    }
    public static boolean isPrime(int n)
    {
        if(n==1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
```

## Problem 2

### Problem Statement

You are given a sequence A1,A2,…,AN. Find the number of pairs (i,j) (1≤i<j≤N) such that Ai+Aj is a prime number.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers A1,A2,…,AN.

### Output

For each test case, print a single line containing one integer — the number of pairs (i,j) (1≤i<j≤N) such that Ai+Aj is a prime number.

### Constraints

1≤T≤100
1≤N≤105
1≤Ai≤109 for each valid i

### Example Input

```
2
5
1 2 3 4 5
3
1 2 3
```

### Example Output

```
2
0
```

### Explanation

Example case 1: The pairs (1,2), (1,3) and (2,3) satisfy the conditions.

Example case 2: No pair of numbers satisfy the conditions.

### Solution

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            int count = 0;
            for(int i=0;i<n
