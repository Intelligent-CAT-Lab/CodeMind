

```

n = int(input())

if n == 1:
    print(0)
    exit()

pMap = {}
for i in range(2, int(n**0.5)+1):
    count = 0
    while n % i == 0:
        count += 1
        n //= i
    if count > 0:
        pMap[i] = count

if n != 1:
    pMap[n] = 1

ans = 0
for pCount in pMap.values():
    i = 1
    while pCount >= i:
        pCount -= i
        ans += 1
        i += 1

print(ans)

```

## 2. 1000000007

```

import java.util.Scanner;

public class p1000000007 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }

        System.out.println(ans);
    }

}

```

python code:

```

n = int(input())

ans = 1
for i in range(1, n+1):
    ans = (ans * i) % 1000000007

print(ans)

```

## 3. 1000000007

```

import java.util.Scanner;

public class p1000000007 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }

        System.out.println(ans);
    }

}

```

python code:

```

n = int(input())

ans = 1
for i in range(1, n+1):
    ans = (ans * i) % 1000000007

print(ans)

```

## 4. 1000000007

```

import java.util.Scanner;

public class p1000000007 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }

        System.out.println(ans);
    }

}

```

python code:

```

n = int(input())

ans = 1
for i in range(1, n+1):
    ans = (ans * i) % 1000000007

print(ans)

```

## 5. 1000000007

```

import java.util.Scanner;

public class p1000000007 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }

        System.out.println(ans);
    }

}

```

python code:

```

n = int(input())

ans = 1
for i in range(1, n+1):
    ans = (ans * i) % 1000000007

print(ans)

```

## 6. 1000000007

```

import java.util.Scanner;

public class p1000000007 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }

        System.out.println(ans);
    }

}

```

python code:

```

n = int(input())

ans = 1
for i in range(1, n+1):
    ans = (ans * i) % 1000000007

print(ans)

```

## 7. 1000000007

```

import java.util.Scanner;

public class p1000000007 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }

        System.out.println(ans);
    }

}

```

python code:

```

n = int(input())

ans = 1
for i in range(1, n+1):
    ans = (ans * i) % 1000000007

print(ans)

```

## 8. 1000000007

```

import java.util.Scanner;

public class p1000000007 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }

        System.out.println(ans);
    }

}

```

python code:

```

n = int(input())

ans = 1
for i in range(1, n+1):
    ans = (ans * i) % 1000000007

print(ans)

```

## 9. 1000000007

```

import java.util.Scanner;

public class p1000000007 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000
