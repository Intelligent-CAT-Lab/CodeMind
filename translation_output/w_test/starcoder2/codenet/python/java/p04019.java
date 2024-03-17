

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] s1 = s.toCharArray();
        int[] s2 = new int[4];
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == 'N') {
                s2[0] = 1;
            } else if (s1[i] == 'S') {
                s2[1] = 1;
            } else if (s1[i] == 'E') {
                s2[2] = 1;
            } else if (s1[i] == 'W') {
                s2[3] = 1;
            }
        }
        int count = 0;
        for (int i = 0; i < s2.length; i++) {
            if (s2[i] == 1) {
                count++;
            }
        }
        if (count == 4) {
            System.out.println("Yes");
        } else if (count == 3) {
            System.out.println("No");
        } else if (count == 2) {
            if ((s2[0] == 1 && s2[1] == 1) || (s2[2] == 1 && s2[3] == 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
```

## 2.

```
Write a program to find the sum of the digits of a number.

Input:
The first line of the input contains a single integer T, denoting the number of test cases. Then T test case follows, a single line of the input containing a positive integer N.

Output:
For each test case, print the sum of the digits of the number N.

Constraints:
1<=T<=100
1<=N<=1000000

Sample Input:
2
12345
123456789

Sample Output:
15
45
```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println(sum);
        }
    }
}
```

## 3.

```
Write a program to find the sum of the digits of a number.

Input:
The first line of the input contains a single integer T, denoting the number of test cases. Then T test case follows, a single line of the input containing a positive integer N.

Output:
For each test case, print the sum of the digits of the number N.

Constraints:
1<=T<=100
1<=N<=1000000

Sample Input:
2
12345
123456789

Sample Output:
15
45
```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println(sum);
        }
    }
}
```

## 4.

```
Write a program to find the sum of the digits of a number.

Input:
The first line of the input contains a single integer T, denoting the number of test cases. Then T test case follows, a single line of the input containing a positive integer N.

Output:
For each test case, print the sum of the digits of the number N.

Constraints:
1<=T<=100
1<=N<=1000000

Sample Input:
2
12345
123456789

Sample Output:
15
45
```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println(sum);
        }
    }
}
```

## 5.

```
Write a program to find the sum of the digits of a number.

Input:
The first line of the input contains a single integer T, denoting the number of test cases. Then T test case follows, a single line of the input containing a positive integer N.

Output:
For each test case, print the sum of the digits of the number N.

Constraints:
1<=T<=100
1<=N<=1000000

Sample Input:
2
12345
123456789

Sample Output:
15
45
```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println(sum);
        }
    }
}
```

## 6.

```
Write a program to find the sum of the digits of a number.

Input:
The first line of the input contains a single integer T, denoting the number of test cases. Then T test case follows, a single line of the input containing a positive integer N.

Output:
For each test case, print the sum of the digits of the number N.

Constraints:
1<=T<=100
1<=N<=1000000

Sample Input:
2
12345
123456789

Sample Output:
15
45
```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println(sum);
        }
    }
}
```

## 7.

```
Write a program to find the sum of the digits of a number.

Input:
The first line of the input contains a single integer T, denoting the number of test cases. Then T test case follows, a single line of the input containing a positive integer N.

Output:
For each test case, print the sum of the digits of the number N.

Constraints:
1<=T<=100
1<=N<=1000000

Sample Input:
2
12345
123456789

Sample Output:
15
45
```

```
