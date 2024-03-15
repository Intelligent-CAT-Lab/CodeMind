
```
s = input()
arr = list(s)
for i in range(len(arr)):
    if arr[i] == 'b':
        arr[i] = 'd'
    elif arr[i] == 'd':
        arr[i] = 'b'
    elif arr[i] == 'p':
        arr[i] = 'q'
    elif arr[i] == 'q':
        arr[i] = 'p'

arr.reverse()
if s == ''.join(arr):
    print('Yes')
else:
    print('No')
```

## 4. 10039번 평균 점수

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p10039 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if (n < 40) {
                sum += 40;
            } else {
                sum += n;
            }
        }
        System.out.println(sum / 5);
    }
}
```

python code:
```
sum = 0
for i in range(5):
    n = int(input())
    if n < 40:
        sum += 40
    else:
        sum += n
print(sum // 5)
```

## 5. 10817번 세 수

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p10817 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if (b > c) {
                System.out.println(b);
            } else if (a > c) {
                System.out.println(c);
            } else {
                System.out.println(a);
            }
        } else {
            if (a > c) {
                System.out.println(a);
            } else if (b > c) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        }
    }
}
```

python code:
```
a, b, c = map(int, input().split())
if a > b:
    if b > c:
        print(b)
    elif a > c:
        print(c)
    else:
        print(a)
else:
    if a > c:
        print(a)
    elif b > c:
        print(c)
    else:
        print(b)
```

## 6. 10871번 X보다 작은 수

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p10871 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a < x) {
                System.out.print(a + " ");
            }
        }
    }
}
```

python code:
```
n, x = map(int, input().split())
arr = list(map(int, input().split()))
for i in range(n):
    if arr[i] < x:
        print(arr[i], end=' ')
```

## 7. 1110번 더하기 사이클

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p1110 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 10;
        int b = n % 10;
        int c = a + b;
        int d = c % 10;
        int e = c / 10;
        int f = b * 10 + d;
        int cnt = 1;
        while (n != f) {
            a = f / 10;
            b = f % 10;
            c = a + b;
            d = c % 10;
            e = c / 10;
            f = b * 10 + d;
            cnt++;
        }
        System.out.println(cnt);
    }
}
```

python code:
```
n = int(input())
a = n // 10
b = n % 10
c = a + b
d = c % 10
e = c // 10
f = b * 10 + d
cnt = 1
while n != f:
    a = f // 10
    b = f % 10
    c = a + b
    d = c % 10
    e = c // 10
    f = b * 10 + d
    cnt += 1
print(cnt)
```

## 8. 1152번 단어의 개수

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p1152 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
```

python code:
```
s = input().split()
cnt = 0
for i in range(len(s)):
    if s[i] != '':
        cnt += 1
print(cnt)
```

## 9. 1157번 단어 공부

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p1157 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toUpperCase().toCharArray();
        int[] cnt = new int[26];
        for (int i = 0; i < arr.length; i++) {
            cnt[arr[i] - 'A']++;
        }
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                maxIdx = i;
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == max && i != maxIdx) {
            
