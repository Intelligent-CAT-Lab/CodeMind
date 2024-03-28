
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int[][] dp = new int[n+1][4];
        dp[0][0] = 1;
        String[] string = {"A","B","C"};
        int num = (int)Math.pow(10,9)+7;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < 4;j++){
                int m = 0,b = 1;
                if(s.charAt(i) == '?') b = 3;
                if(j == 0){
                    if(s.charAt(i) == '?') dp[i+1][j] = (dp[i][j] * 3)%num;
                    else dp[i+1][j] = (dp[i][j])%num;
                    continue;
                }
                if(s.charAt(i) == string[j-1].charAt(0) || s.charAt(i) == '?') m = 1;
                dp[i+1][j] = (m*dp[i][j-1] + b*dp[i][j])%num;
            }
        }
        System.out.println(dp[n][3]);
    }
}
```

## 2. 
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"

```java
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n == 0) return "";
        int max = 1;
        int start = 0;
        boolean[][] dp = new boolean[n][n];
        for(int i = 0;i < n;i++){
            dp[i][i] = true;
        }
        for(int i = 0;i < n-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                max = 2;
                start = i;
            }
        }
        for(int l = 3;l <= n;l++){
            for(int i = 0;i < n-l+1;i++){
                int j = i+l-1;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;
                    if(l > max){
                        max = l;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start,start+max);
    }
}
```

## 3. 
Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:
4
One possible longest palindromic subsequence is "bbbb".
Example 2:
Input:

"cbbd"
Output:
2
One possible longest palindromic subsequence is "bb".

```java
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i = 0;i < n;i++){
            dp[i][i] = 1;
        }
        for(int l = 2;l <= n;l++){
            for(int i = 0;i < n-l+1;i++){
                int j = i+l-1;
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1]+2;
                }else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
}
```/Week_03/README.md
# 学习笔记

## 1. 递归

### 1.1 递归的实现、特性以及思维要点

递归的实现：

```java
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
}
```

递归的思维要点：

- 不要人肉进行递归（最大误区）
- 找到最近最简方法，将其拆解成可重复解决的问题（重复子问题）
- 数学归纳法思维

### 1.2 递归代码模板

```java
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
}
```

### 1.3 递归的思维要点

- 人肉递归低效、很累
- 找到最近最简方法，将其拆解成可重复解决的问题
- 数学归纳法思维

### 1.4 递归的注意事项

- 警惕堆栈溢出
- 警惕重复计算
- 递归代码要有终止条件

### 1.5 递归的改写

- 循环改写递归
- 递归改写循环

## 2. 分治、回溯

### 2.1 分治

分治代码模板

```java
public void divide_conquer(problem, param1, param2, ...) { 
  // recursion terminator 
  if (problem == NULL) { 
    print_result 
    return; 
  } 
  // prepare data 
  data = prepare_data(problem) 
  subproblems = split_problem(problem, data) 
  // conquer subproblems 
  subresult1 = divide_conquer(subproblems[0], p1, ...) 
  subresult2 = divide_conquer(subproblems[1], p1, ...) 
  subresult3 = divide_conquer(subproblems[2], p1, ...) 
  …
  // process and generate the final result 
  result = process_result(subresult1, subresult2, subresult3, …)
  // revert the current level states 
}
```

### 2.2 回溯

回溯代码模板

```java
result = []
def backtrack(路径, 选择列表):
    if 满足结束条件:
        result.add(路径)
        return
    
    for 选择 in 选择列表:
        做选择
        backtrack(路径, 选择列表)
        撤销选择
```

## 3. 实战题目解析：爬楼梯、括号生成、Pow(x, n)、子集、N皇后

### 3.1 爬楼梯

```java
