

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        Set<String> coord = new HashSet<>();
        coord.add("0,0");
        String temp = "0,0";
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c == 'L') {
                temp = temp.split(",")[0] + "," + (Integer.parseInt(temp.split(",")[1]) - 1);
            } else if (c == 'R') {
                temp = temp.split(",")[0] + "," + (Integer.parseInt(temp.split(",")[1]) + 1);
            } else if (c == 'U') {
                temp = (Integer.parseInt(temp.split(",")[0]) - 1) + "," + temp.split(",")[1];
            } else {
                temp = (Integer.parseInt(temp.split(",")[0]) + 1) + "," + temp.split(",")[1];
            }
            if (coord.contains(temp)) {
                System.out.println("BUG");
                System.exit(0);
            }
            coord.add(temp);
        }
        coord.remove("0,0");
        Queue<String> que = new LinkedList<>();
        que.add("0,0");
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                System.exit(0);
            }
            String[] tempArr = que.poll().split(",");
            int i = Integer.parseInt(tempArr[0]);
            int j = Integer.parseInt(tempArr[1]);
            for (int[] p : new int[][]{{i + 1, j}, {i - 1, j}, {i, j + 1}, {i, j - 1}}) {
                if (coord.contains(p[0] + "," + p[1])) {
                    coord.remove(p[0] + "," + p[1]);
                    que.add(p[0] + "," + p[1]);
                }
            }
        }
        System.out.println("OK");
    }
}
```

## 2. 2019-2020 ACM-ICPC, Asia Daejeon Regional Contest, Problem A

### 2.1. Description

Given a string, find the longest substring that contains only two unique characters.

### 2.2. Input

The first line of the input contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains a string S.

### 2.3. Output

For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the length of the longest substring that contains exactly two unique characters.

### 2.4. Sample Input

```
5
abacaba
abacaba
abacaba
abacaba
abacaba
```

### 2.5. Sample Output

```
Case #1: 3
Case #2: 3
Case #3: 3
Case #4: 3
Case #5: 3
```

### 2.6. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            String s = sc.next();
            int max = 0;
            for (int j = 0; j < s.length(); j++) {
                for (int k = j + 1; k < s.length(); k++) {
                    if (s.charAt(j) != s.charAt(k)) {
                        int count = 0;
                        for (int l = j; l <= k; l++) {
                            if (s.charAt(l) == s.charAt(j) || s.charAt(l) == s.charAt(k)) {
                                count++;
                            }
                        }
                        if (count > max) {
                            max = count;
                        }
                    }
                }
            }
            System.out.println("Case #" + i + ": " + max);
        }
    }
}
```

## 3. 2019-2020 ACM-ICPC, Asia Daejeon Regional Contest, Problem B

### 3.1. Description

Given a string, find the longest substring that contains only two unique characters.

### 3.2. Input

The first line of the input contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains a string S.

### 3.3. Output

For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the length of the longest substring that contains exactly two unique characters.

### 3.4. Sample Input

```
5
abacaba
abacaba
abacaba
abacaba
abacaba
```

### 3.5. Sample Output

```
Case #1: 3
Case #2: 3
Case #3: 3
Case #4: 3
Case #5: 3
```

### 3.6. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            String s = sc.next();
            int max = 0;
            for (int j = 0; j < s.length(); j++) {
                for (int k = j + 1; k < s.length(); k++) {
                    if (s.charAt(j) != s.charAt(k)) {
                        int count = 0;
                        for (int l = j; l <= k; l++) {
                            if (s.charAt(l) == s.charAt(j) || s.charAt(l) == s.charAt(k)) {
                                count++;
                            }
                        }
                        if (count > max) {
                            max = count;
                        }
                    }
                }
            }
            System.out.println("Case #" + i + ": " + max);
        }
    }
}
```

## 4. 2019-2020 ACM-ICPC, Asia Daejeon Regional Contest, Problem C

### 4.1. Description

Given a string, find the longest substring that contains only two unique characters.

### 4.2. Input

The first line of the input contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains a string S.

### 4.3. Output

For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the length of the longest substring that contains exactly two unique characters.

### 4.4. Sample Input
