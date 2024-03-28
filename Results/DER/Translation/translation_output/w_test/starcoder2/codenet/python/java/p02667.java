

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int res = solve(t);
        System.out.println(res);
    }

    public static int solve(String t) {
        int res = 0;
        int length = 0;
        int n = t.length();
        int[] used = new int[n];
        // insert 1 greedy
        for (int i = 0; i < n; i++) {
            if (t.charAt(i) == '1') {
                length++;
                res += (length + 1) / 2;
                used[i] = 1;
            }
        }

        // insert 0 greedy
        int cnt_temp = 0;
        for (int i = 0; i < n; i++) {
            if (used[i] == 1) {
                cnt_temp++;
            } else if (cnt_temp % 2 == 1) {
                // add 0 if it is 2, 4, 6 th
                cnt_temp++;
                length++;
                res += (length + 1) / 2;
                used[i] = 1;
            }
        }

        int cnt_unused = n - sum(used);
        int switch_count = 0;
        // split by other 0
        int st = 0;
        int cnt_1_even = 0;
        int cnt_1_odd = 0;
        for (int i = 0; i < n; i++) {
            if (used[i] == 0) {
                int switched = (switch_count + 1) / 2;
                int non_switched = cnt_unused - switched;
                res += cnt_1_even * non_switched + cnt_1_odd * switched;
                st = i + 1;
                switch_count++;
                cnt_1_even = 0;
                cnt_1_odd = 0;
            }
            if (t.charAt(i) == '1') {
                if ((i - st) % 2 == 0) {
                    cnt_1_even++;
                } else {
                    cnt_1_odd++;
                }
            }
        }

        // add last
        int switched = (switch_count + 1) / 2;
        int non_switched = cnt_unused - switched;
        res += cnt_1_even * non_switched + cnt_1_odd * switched;

        return res;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```

## 2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
def solve(n):
    return n


def main():
    n = int(input())
    res = solve(n)
    print(res)


def test():
    assert solve(1000000007) == 1000000007


if __name__ == "__main__":
    test()
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = solve(n);
        System.out.println(res);
    }

    public static int solve(int n) {
        return n;
    }
}
```

## 3. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
def solve(n):
    return n


def main():
    n = int(input())
    res = solve(n)
    print(res)


def test():
    assert solve(1000000007) == 1000000007


if __name__ == "__main__":
    test()
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = solve(n);
        System.out.println(res);
    }

    public static int solve(int n) {
        return n;
    }
}
```

## 4. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
def solve(n):
    return n


def main():
    n = int(input())
    res = solve(n)
    print(res)


def test():
    assert solve(1000000007) == 1000000007


if __name__ == "__main__":
    test()
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = solve(n);
        System.out.println(res);
    }

    public static int solve(int n) {
        return n;
    }
}
```

## 5. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
def solve(n):
    return n


def main():
    n = int(
