
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

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
dp = [[0 for i in range(n+1)] for j in range(n+1)]
for i in range(1,n+1):
    for j in range(1,n+1):
        if i == j:dp[i][j] = 1
        else:dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
print(dp[n][n])
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][n+1];
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                if(i == j) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
        System.out.println(dp[n][n]);
    }
}
```
/2019-2020/2019-2020-1/2019-2020-1-1.md
# 2019-2020-1-1

## 1.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
dp = [[0 for i in range(n+1)] for j in range(n+1)]
for i in range(1,n+1):
    for j in range(1,n+1):
        if i == j:dp[i][j] = 1
        else:dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
print(dp[n][n])
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][n+1];
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                if(i == j) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
        System.out.println(dp[n][n]);
    }
}
```

## 2.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
dp = [[0 for i in range(n+1)] for j in range(n+1)]
for i in range(1,n+1):
    for j in range(1,n+1):
        if i == j:dp[i][j] = 1
        else:dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
print(dp[n][n])
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][n+1];
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                if(i == j) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
        System.out.println(dp[n][n]);
    }
}
```

## 3.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
dp = [[0 for i in range(n+1)] for j in range(n+1)]
for i in range(1,n+1):
    for j in range(1,n+1):
        if i == j:dp[i][j] = 1
        else:dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
print(dp[n][n])
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][n+1];
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                if(i == j) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
        System.out.println(dp[n][n]);
    }
}
```

## 4.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
dp = [[0 for i in range(n+1)] for j in range(n+1)]
for i in range(1,n+1):
    for j in range(1,n+1):
        if i == j:dp[i][j] = 1
        else:dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
print(dp[n][n])
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][n+1];
        for(int i = 1;i <= n
