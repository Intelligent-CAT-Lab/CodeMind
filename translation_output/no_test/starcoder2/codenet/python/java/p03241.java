
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        double MN = (double)M/N;
        int[] divisor = make_divisors(M);
        int max_gcd = 0;
        for (int d : divisor) {
            if (d<=MN && d>=max_gcd) {
                max_gcd = d;
            }
        }
        System.out.println(max_gcd);
    }

    public static int[] make_divisors(int n) {
        int[] divisors = new int[n];
        int i = 0;
        for (int j=1; j<=Math.sqrt(n); j++) {
            if (n%j==0) {
                divisors[i] = j;
                i++;
                if (j != n/j) {
                    divisors[i] = n/j;
                    i++;
                }
            }
        }
        return divisors;
    }
}
```

## 10. 1000000007

### 10.1. Problem

Given an integer N, find the largest integer X such that X is a divisor of N and X<N.

### 10.2. Input

The first line contains an integer T, the number of test cases. Then T lines follow, each line contains an integer N.

### 10.3. Output

For each test case, print the required answer in a new line.

### 10.4. Constraints

1<=T<=100000
1<=N<=1000000000

### 10.5. Example

#### 10.5.1. Input:

```
3
1
2
10
```

#### 10.5.2. Output:

```
1
1
5
```

### 10.6. Explanation

**Testcase 1:** 1 is a divisor of 1.

**Testcase 2:** 1 is the largest integer less than 2 which is a divisor of 2.

**Testcase 3:** 5 is the largest integer less than 10 which is a divisor of 10.
/src/main/java/com/victorman/hackerrank/algorithms/implementation/SockMerchant.java
package com.victorman.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i=0; i<n; i++) {
            ar[i] = sc.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

    public static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            if (map.containsKey(ar[i])) {
                map.put(ar[i], map.get(ar[i])+1);
            } else {
                map.put(ar[i], 1);
            }
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result += entry.getValue()/2;
        }
        return result;
    }
}
/src/main/java/com/victorman/hackerrank/algorithms/implementation/BetweenTwoSets.java
package com.victorman.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i=0; i<m; i++) {
            b[i] = sc.nextInt();
        }
        int result = getTotalX(a, b);
        System.out.println(result);
    }

    public static int getTotalX(int[] a, int[] b) {
        int result = 0;
        for (int i=1; i<=100; i++) {
            boolean flag = true;
            for (int j=0; j<a.length; j++) {
                if (i%a[j]!=0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int j=0; j<b.length; j++) {
                    if (b[j]%i!=0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                result++;
            }
        }
        return result;
    }
}
/src/main/java/com/victorman/hackerrank/algorithms/implementation/GradingStudents.java
package com.victorman.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grades = new int[n];
        for (int i=0  }
        return grades;
    }
}
; i<n; i++) {
            grades[i] = sc.nextInt();
        }
        int[] result = gradingStudents(grades);
        for (int i=0; i<n; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] gradingStudents(int[] grades) {
        for (int i=0; i<grades.length; i++) {
            if (grades[i]>=38 && grades[i]%5>=3) {
                grades[i] += 5-grades[i]%5;
            }
      /src/main/java/com/victorman/hackerrank/algorithms/implementation/AppleAndOrange.java
package com.victorman.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] apple = new int[m];
        for (int i=0; i<m; i++) {
            apple[i] = sc.nextInt();
        }
        int[] orange = new int[n];
        for (int i=0; i<n; i++) {
            orange[i] = sc.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apple, int[] orange) {
        int appleCount = 0;
        int orangeCount = 0;
        for (int i=0; i<apple.length; i++) {
            if (a+apple[i]>=s && a+apple[i]<=t) {
                appleCount++;
            }
        }
        for (int i=0; i<orange.length; i++) {
            if (b+orange[i]>=s && b+orange[i]<=t) {
                orangeCount++;
           
