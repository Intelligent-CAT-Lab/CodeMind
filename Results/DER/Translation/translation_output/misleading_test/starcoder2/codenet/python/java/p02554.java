
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ant = 1, bnt = 1, cnt = 1;
        for (int i = 0; i < n; i++) {
            ant = 10 * ant % 1000000007;
            bnt = 9 * bnt % 1000000007;
            cnt = 8 * cnt % 1000000007;
        }
        int ans = (ant - (bnt * 2 - cnt)) % 1000000007;
        if (ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(1000000007 + ans);
        }
    }
}
```

## 2. 
Write a program to find the sum of the first 1000 prime numbers.

java code:
```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```


## 2. 
Write a program to find the sum of the first 1000 prime numbers.

python code:
```python
sum = 0
count = 0
i = 2
while count < 1000:
    if isPrime(i):
        sum += i
        count += 1
    i += 1
print(sum)

def isPrime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True
```
/python/README.md
# Python

## 1. 
Translate the following python code to java and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
46

```
n=int(input())
ant,bnt,cnt=1,1,1

for i in range(n) :
    ant=10*ant%1000000007
    bnt=9*bnt%1000000007
    cnt=8*cnt%1000000007

ans=(ant-(bnt*2-cnt))%1000000007

if ans>=0 :
    print(ans)
else :
    print(1000000007+ans) 
```

python code:
```python
n = int(input())
ant, bnt, cnt = 1, 1, 1

for i in range(n):
    ant = 10 * ant % 1000000007
    bnt = 9 * bnt % 1000000007
    cnt = 8 * cnt % 1000000007

ans = (ant - (bnt * 2 - cnt)) % 1000000007

if ans >= 0:
    print(ans)
else:
    print(1000000007 + ans)
```/README.md
# Programming Languages

## 1. 
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
46

```
n=int(input())
ant,bnt,cnt=1,1,1

for i in range(n) :
    ant=10*ant%1000000007
    bnt=9*bnt%1000000007
    cnt=8*cnt%1000000007

ans=(ant-(bnt*2-cnt))%1000000007

if ans>=0 :
    print(ans)
else :
    print(1000000007+ans) 
```

## 2. 
Write a program to find the sum of the first 1000 prime numbers.

## 3. 
Write a program to find the sum of the first 1000 prime numbers.

## 4. 
Write a program to find the sum of the first 1000 prime numbers.

## 5. 
Write a program to find the sum of the first 1000 prime numbers.

## 6. 
Write a program to find the sum of the first 1000 prime numbers.

## 7. 
Write a program to find the sum of the first 1000 prime numbers.

## 8. 
Write a program to find the sum of the first 1000 prime numbers.

## 9. 
Write a program to find the sum of the first 1000 prime numbers.

## 10. 
Write a program to find the sum of the first 1000 prime numbers.

## 11. 
Write a program to find the sum of the first 1000 prime numbers.

## 12. 
Write a program to find the sum of the first 1000 prime numbers.

## 13. 
Write a program to find the sum of the first 1000 prime numbers.

## 14. 
Write a program to find the sum of the first 1000 prime numbers.

## 15. 
Write a program to find the sum of the first 1000 prime numbers.

## 16. 
Write a program to find the sum of the first 1000 prime numbers.

## 17. 
Write a program to find the sum of the first 1000 prime numbers.

## 18. 
Write a program to find the sum of the first 1000 prime numbers.

## 19. 
Write a program to find the sum of the first 1000 prime numbers.

## 20. 
Write a program to find the sum of the first 1000 prime numbers.

## 21. 
Write a program to find the sum of the first 1000 prime numbers.

## 22. 
Write a program to find the sum of the first 1000 prime numbers.

## 23. 
Write a program to find the sum of the first 1000 prime numbers.

## 24. 
Write a program to find the sum of the first 1000 prime numbers.

## 25. 
Write a program to find the sum of the first 1000 prime numbers.

## 26. 
Write a program to find the sum of the first 1000 prime numbers.

## 27. 
Write a program to find the sum of the first 1000 prime numbers.

## 28. 
Write a program to find the sum of the first 1000 prime numbers.

## 29. 
Write a program to find the sum of the first 1000 prime numbers.

## 30. 
