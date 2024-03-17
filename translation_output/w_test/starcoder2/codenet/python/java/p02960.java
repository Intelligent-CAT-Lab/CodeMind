
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int l = S.length();
        int mod = (int)1e9+7;
        int[][] dp = new int[l+1][13];
        dp[0][0] = 1;
        for(int i=0;i<l;i++){
            char s = S.charAt(i);
            for(int j=0;j<13;j++){
                if(s=='?'){
                    for(int k=0;k<10;k++){
                        dp[i+1][((j*10)+k)%13] += dp[i][j];
                        dp[i+1][((j*10)+k)%13]%=mod;
                    }
                }else{
                    dp[i+1][((j*10)+s-'0')%13] += dp[i][j];
                    dp[i+1][((j*10)+s-'0')%13]%=mod;
                }
            }
        }
        System.out.println(dp[l][5]);
    }
}
```

## 2.

Given a string S, find the number of substrings that start and end with the same character.

For example, if the input is ```aba```, then there are 3 substrings that start and end with the same character: ```a, b, a```.

Write a function that takes a string as input and returns the number of substrings that start and end with the same character.

```
def count_substring(string):
    # Write your code here
```

Sample test case:

```
Input:
aba

Output:
3
```

```
def count_substring(string):
    # Write your code here
    count = 0
    for i in range(len(string)):
        for j in range(i,len(string)):
            if string[i] == string[j]:
                count += 1
    return count
```

## 3.

Given a string S, find the number of substrings that start and end with the same character.

For example, if the input is ```aba```, then there are 3 substrings that start and end with the same character: ```a, b, a```.

Write a function that takes a string as input and returns the number of substrings that start and end with the same character.

```
def count_substring(string):
    # Write your code here
```

Sample test case:

```
Input:
aba

Output:
3
```

```
def count_substring(string):
    # Write your code here
    count = 0
    for i in range(len(string)):
        for j in range(i,len(string)):
            if string[i] == string[j]:
                count += 1
    return count
```

## 4.

Given a string S, find the number of substrings that start and end with the same character.

For example, if the input is ```aba```, then there are 3 substrings that start and end with the same character: ```a, b, a```.

Write a function that takes a string as input and returns the number of substrings that start and end with the same character.

```
def count_substring(string):
    # Write your code here
```

Sample test case:

```
Input:
aba

Output:
3
```

```
def count_substring(string):
    # Write your code here
    count = 0
    for i in range(len(string)):
        for j in range(i,len(string)):
            if string[i] == string[j]:
                count += 1
    return count
```

## 5.

Given a string S, find the number of substrings that start and end with the same character.

For example, if the input is ```aba```, then there are 3 substrings that start and end with the same character: ```a, b, a```.

Write a function that takes a string as input and returns the number of substrings that start and end with the same character.

```
def count_substring(string):
    # Write your code here
```

Sample test case:

```
Input:
aba

Output:
3
```

```
def count_substring(string):
    # Write your code here
    count = 0
    for i in range(len(string)):
        for j in range(i,len(string)):
            if string[i] == string[j]:
                count += 1
    return count
```

## 6.

Given a string S, find the number of substrings that start and end with the same character.

For example, if the input is ```aba```, then there are 3 substrings that start and end with the same character: ```a, b, a```.

Write a function that takes a string as input and returns the number of substrings that start and end with the same character.

```
def count_substring(string):
    # Write your code here
```

Sample test case:

```
Input:
aba

Output:
3
```

```
def count_substring(string):
    # Write your code here
    count = 0
    for i in range(len(string)):
        for j in range(i,len(string)):
            if string[i] == string[j]:
                count += 1
    return count
```

## 7.

Given a string S, find the number of substrings that start and end with the same character.

For example, if the input is ```aba```, then there are 3 substrings that start and end with the same character: ```a, b, a```.

Write a function that takes a string as input and returns the number of substrings that start and end with the same character.

```
def count_substring(string):
    # Write your code here
```

Sample test case:

```
Input:
aba

Output:
3
```

```
def count_substring(string):
    # Write your code here
    count = 0
    for i in range(len(string)):
        for j in range(i,len(string)):
            if string[i] == string[j]:
                count += 1
    return count
```

## 8.

Given a string S, find the number of substrings that start and end with the same character.

For example, if the input is ```aba```, then there are 3 substrings that start and end with the same character: ```a, b, a```.

Write a function that takes a string as input and returns the number of substrings that start and end with the same character.

```
def count_substring(string):
    # Write your code here
```

Sample test case:

```
Input:
aba

Output:
3
```

```
def count_substring(string):
    # Write your code here
    count = 0
    for i in range(len(string)):
        for j in range(i,len(string)):
            if string[i] == string[j]:
                count += 1
    return count
```

## 9.

Given a string S, find the number of substrings that start and end with the same character.

For example, if the input is ```aba```, then there are 3 substrings that start and end with the same character: ```a, b, a```.

Write a function that takes a string as input and returns the number of substrings that start and end with the same character.

```
def count_substring(string):
    # Write your code here
```

Sample test case:

```
Input:
aba

Output:

