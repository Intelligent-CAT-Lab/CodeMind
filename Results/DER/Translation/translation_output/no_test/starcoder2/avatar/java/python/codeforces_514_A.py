
```
x = int(input())

list = []

while x > 0:
    r = x % 10
    if 9 - r < r:
        if x / 10 == 0 and 9 - r == 0:
            list.append(r)
        else:
            list.append(9 - r)
    else:
        list.append(r)
    x = x / 10

pow = 0
newNumber = 0

for i in range(len(list)):
    newNumber = newNumber + list[i] * (10 ** pow)
    pow += 1

print(newNumber)
```

## 514B. 
```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_514_B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int a = x1 - x;
            int b = y1 - y;

            int gcd = gcd(a, b);

            a = a / gcd;
            b = b / gcd;

            if (a < 0) {
                a = -a;
                b = -b;
            }

            list.add(a * 1000000 + b);
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i) / 1000000;
            int b = list.get(i) % 1000000;

            for (int j = i + 1; j < list.size(); j++) {
                int a1 = list.get(j) / 1000000;
                int b1 = list.get(j) % 1000000;

                if (a == a1 && b == b1) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(n - count);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
```

python code:
```
n, m, x, y = map(int, input().split())

list = []

for i in range(n):
    x1, y1 = map(int, input().split())

    a = x1 - x
    b = y1 - y

    gcd = gcd(a, b)

    a = a / gcd
    b = b / gcd

    if a < 0:
        a = -a
        b = -b

    list.append(a * 1000000 + b)

count = 0
for i in range(len(list)):
    a = list[i] / 1000000
    b = list[i] % 1000000

    for j in range(i + 1, len(list)):
        a1 = list[j] / 1000000
        b1 = list[j] % 1000000

        if a == a1 and b == b1:
            count += 1
            break

print(n - count)
```

## 514C. 
```
import java.util.Scanner;

public class codeforces_514_C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        for (int i = 0; i < m; i++) {
            String word = sc.next();
            boolean flag = false;

            for (int j = 0; j < n; j++) {
                if (words[j].length() == word.length()) {
                    int count = 0;
                    for (int k = 0; k < word.length(); k++) {
                        if (word.charAt(k) == words[j].charAt(k) || word.charAt(k) == '*')
                            count++;
                    }

                    if (count == word.length()) {
                        flag = true;
                        break;
                    }
                }
            }

            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
```

python code:
```
n, m = map(int, input().split())

words = []
for i in range(n):
    words.append(input())

for i in range(m):
    word = input()
    flag = False

    for j in range(n):
        if len(words[j]) == len(word):
            count = 0
            for k in range(len(word)):
                if word[k] == words[j][k] or word[k] == '*':
                    count += 1

            if count == len(word):
                flag = True
                break

    if flag:
        print("YES")
    else:
        print("NO")
```
 1000000000000000000

for i in range(n):
    x, y = map(int, input().split())
    if x < min_x:
        min_x = x
    if y < min_y:
        min_y = y

print(min_x + min_y)
```
/codeforces/codeforces_514.md
# codeforces 514

## 514A. 
```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        long x = sc.nextLong();

        while (x > 0) {
            long r = x % 10;
            if (9 - r < r) {
                if (x / 10 == 0 && 9 - r == 0)
                    list.add(r);
                else
                    list.add(9 - r);
            } else {
                list.add(r);
            }
            x = x / 10;
        }

        int pow = 0;
        long newNumber = 0;

        for (int i = 0; i < list.size(); i++) {
            newNumber = newNumber + list.get(i) * (long) Math.pow(10, pow);
            pow++;
        }

        System.out.println(newNumber);
    }
}
```

python code:
```
x = int(input())

list = []

while x > 0:
    r = x % 10
    if 9 - r < r:
        if x / 10 == 0 and 9 - r == 0:
            list.append(r)
        else:
            list.append(9 - r)
    else:
        list.append(r)
    x = x / 10

pow = 0
newNumber = 0

for i in range(len(list)):
    new
