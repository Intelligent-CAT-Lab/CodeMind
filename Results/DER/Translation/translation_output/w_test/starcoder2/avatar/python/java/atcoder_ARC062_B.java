

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int g = 0, p = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'g') g++;
            else if (S.charAt(i) == 'p') p++;
        }
        System.out.println((g - p) / 2);
    }
}
```

## 2. 1000000007

### 2.1. Problem

Given a number N, find the sum of all the numbers from 1 to N.

### 2.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 2.3. Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N.

### 2.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 2.5. Example

#### 2.5.1. Input:

```
2
3
4
```

#### 2.5.2. Output:

```
6
10
```

### 2.6. Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

### 2.7. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            System.out.println(N * (N + 1) / 2);
        }
    }
}
```

## 3. 1000000009

### 3.1. Problem

Given a number N, find the sum of all the numbers from 1 to N.

### 3.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 3.3. Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N modulo 1000000009.

### 3.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 3.5. Example

#### 3.5.1. Input:

```
2
3
4
```

#### 3.5.2. Output:

```
6
10
```

### 3.6. Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

### 3.7. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            System.out.println((N * (N + 1) / 2) % 1000000009);
        }
    }
}
```

## 4. 10000000019

### 4.1. Problem

Given a number N, find the sum of all the numbers from 1 to N.

### 4.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 4.3. Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N modulo 10000000019.

### 4.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 4.5. Example

#### 4.5.1. Input:

```
2
3
4
```

#### 4.5.2. Output:

```
6
10
```

### 4.6. Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

### 4.7. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            System.out.println((N * (N + 1) / 2) % 10000000019);
        }
    }
}
```

## 5. 10000000073

### 5.1. Problem

Given a number N, find the sum of all the numbers from 1 to N.

### 5.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 5.3. Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N modulo 10000000073.

### 5.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 5.5. Example

#### 5.5.1. Input:

```
2
3
4
```

#### 5.5.2. Output:

```
6
10
```

### 5.6. Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

### 5.7. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            System.out.println((N * (N + 1) / 2) % 10000000073);
        }
    }
}
```

## 6. 100000000003

### 6.1. Problem

Given a number N, find the sum of all the numbers from 1 to N.

### 6.2. Input

The first line of the input contains a single integer T denoting the number of
