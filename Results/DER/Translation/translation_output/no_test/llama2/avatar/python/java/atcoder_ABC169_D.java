<s> Translate the following python code to java and enclose your solution inside ```java```:
```
x = int ( input ( ) )
def factorization ( n ) :
    arr = [ ]
    temp = n
    for i in range ( 2 , int ( - ( - n ** 0.5 // 1 ) ) + 1 ) :
        if temp % i == 0 :
            cnt = 0
            while temp % i == 0 :
                cnt += 1
                temp //= i
            arr . append ( [ i , cnt ] )
    if temp != 1 :
        arr . append ( [ temp , 1 ] )
    if arr == [ ] :
        arr . append ( [ n , 1 ] )
    return arr
l = factorization ( x )
l = sorted ( l )
ans = 0
for i in range ( len ( l ) ) :
    if l [ i ] [ 0 ] == 1 :
        continue
    else :
        s = 0
        num = l [ i ] [ 1 ]
        if num == 1 :
            j = 1
        else :
            for j in range ( 1 , num ) :
                s += j
                if s == num :
                    break
                elif s > num :
                    j -= 1
                    break
        ans += j
print ( ans )


```

### 解答

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] arr = new int[0];
        int temp = x;
        for (int i = 2; i <= Math.ceil(Math.sqrt(-x)); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr = new int[]{i, cnt};
            }
        }
        if (temp != 1) {
            arr = new int[]{temp, 1};
        }
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 1) {
                continue;
            } else {
                int s = 0;
                int num = arr[i][1];
                if (num == 1) {
                    int j = 1;
                } else {
                    for (int j = 1; j <= num; j++) {
                        s += j;
                        if (s == num) {
                            break;
                        } else if (s > num) {
                            j--;
                            break;
                        }
                    }
                }
                ans += j;
            }
        }
        System.out.println(ans);
    }
}
```

### 解析

```python
x = int ( input ( ) )
```

```python
def factorization ( n ) :
    arr = [ ]
    temp = n
    for i in range ( 2 , int ( - ( - n ** 0.5 // 1 ) ) + 1 ) :
        if temp % i == 0 :
            cnt = 0
            while temp % i == 0 :
                cnt += 1
                temp //= i
            arr . append ( [ i , cnt ] )
    if temp != 1 :
        arr . append ( [ temp , 1 ] )
    if arr == [ ] :
        arr . append ( [ n , 1 ] )
    return arr
```

```python
l = factorization ( x )
l = sorted ( l )
ans = 0
for i in range ( len ( l ) ) :
    if l [ i ] [ 0 ] == 1 :
        continue
    else :
        s = 0
        num = l [ i ] [ 1 ]
        if num == 1 :
            j = 1
        else :
            for j in range ( 1 , num ) :
                s += j
                if s == num :
                    break
                elif s > num :
                    j -= 1
                    break
        ans += j
print ( ans )
```

### 解析

```python
x = int ( input ( ) )
```

```python
def factorization ( n ) :
    arr = [ ]
    temp = n
    for i in range ( 2 , int ( - ( - n ** 0.5 // 1 ) ) + 1 ) :
        if temp % i == 0 :
            cnt = 0
            while temp % i == 0 :
                cnt += 1
                temp //= i
            arr . append ( [ i , cnt ] )
    if temp != 1 :
        arr . append ( [ temp , 1 ] )
    if arr == [ ] :
        arr . append ( [ n , 1 ] )
    return arr
```

```python
l = factorization ( x )
l = sorted ( l )
ans = 0
for i in range ( len ( l ) ) :
    if l [ i ] [ 0 ] == 1 :
        continue
    else :
        s = 0
        num = l [ i ] [ 1 ]
        if num == 1 :
            j = 1
        else :
            for j in range ( 1 , num ) :
                s += j
                if s == num :
                    break
                elif s > num :
                    j -= 1
                    break
        ans += j
print ( ans )
```

### 解析

```python
x = int ( input ( ) )
```

```python
def factorization ( n ) :
    arr = [ ]
    temp = n
    for i in range ( 2 , int ( - ( - n ** 0.5 // 1 ) ) + 1 ) :
        if temp % i == 0 :
            cnt = 0
            while temp % i == 0 :
                cnt += 1
                temp //= i
            arr . append ( [ i , cnt ] )
    if temp != 1 :
        arr . append ( [ temp , 1 ] )
    if arr == [ ] :
        arr . append ( [ n , 1 ] )
    return arr
```

```python
l = factorization ( x )
l = sorted ( l )
ans = 0
for i in range ( len ( l ) ) :
    if l [ i ] [ 0 ] == 1 :
        continue
    else :
        s = 0
        num = l [ i ] [ 1 ]
        if num == 1 :
            j = 1
        else :
            for j in range ( 1 , num ) :
                s += j
                if s == num :
                    break
                elif s > num :
                    j -= 1
                    break
        ans += j
print ( ans )
```

### 解析

```python
x = int ( input ( ) )
```

```python
def factorization ( n ) :
    arr = [ ]
    temp = n
    for i in range ( 2 , int ( - ( - n ** 0.5 // 1 ) ) + 1 ) :
        if temp % i == 0 :
            cnt = 0
            while temp % i == 0 :
                cnt += 1
                temp //= i
            arr . append ( [ i , cnt ] )
    if temp != 1 :
        arr . append ( [ temp , 1 ] )
    if arr == [ ] :
        arr . append ( [ n , 1 ] )
    return arr
```

```python
l = factorization ( x )
l = sorted ( l )
ans = 0
for i in range ( len ( l ) ) :
    if l [ i ] [ 0 ] == 1 :
        continue
    else :
        s = 0
        num = l [ i ] [ 1 ]
        if num == 1 :
            j = 1
        else :
            for j in range ( 1 , num ) :
                s += j
                if s == num :
                    break
                elif s >
