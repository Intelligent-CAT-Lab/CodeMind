<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
def solve ( H : int , W : int , A : int , B : int ) :
    answer = [ [ "0" ] * W for _ in range ( H ) ]
    for i in range ( H ) :
        for j in range ( W ) :
            if i < B :
                if j < A :
                    answer [ i ] [ j ] = "0"
                else :
                    answer [ i ] [ j ] = "1"
            else :
                if j < A :
                    answer [ i ] [ j ] = "1"
                else :
                    answer [ i ] [ j ] = "0"
    for i in range ( H ) :
        print ( ' ' . join ( answer [ i ] ) )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys . stdin :
            for word in line . split ( ) :
                yield word
    tokens = iterate_tokens ( )
    H = int ( next ( tokens ) )
    W = int ( next ( tokens ) )
    A = int ( next ( tokens ) )
    B = int ( next ( tokens ) )
    solve ( H , W , A , B )
if __name__ == ' _ _ main _ _ ' :
    main ( )


```

### 解答

```java
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[][] answer = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i < B) {
                    if (j < A) {
                        answer[i][j] = 0;
                    } else {
                        answer[i][j] = 1;
                    }
                } else {
                    if (j < A) {
                        answer[i][j] = 1;
                    } else {
                        answer[i][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            System.out.print(Arrays.toString(answer[i]));
        }
    }
}
```

### 解析

```python
import sys
def solve ( H : int , W : int , A : int , B : int ) :
    answer = [ [ "0" ] * W for _ in range ( H ) ]
    for i in range ( H ) :
        for j in range ( W ) :
            if i < B :
                if j < A :
                    answer [ i ] [ j ] = "0"
                else :
                    answer [ i ] [ j ] = "1"
            else :
                if j < A :
                    answer [ i ] [ j ] = "1"
                else :
                    answer [ i ] [ j ] = "0"
    for i in range ( H ) :
        print ( ' ' . join ( answer [ i ] ) )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys . stdin :
            for word in line . split ( ) :
                yield word
    tokens = iterate_tokens ( )
    H = int ( next ( tokens ) )
    W = int ( next ( tokens ) )
    A = int ( next ( tokens ) )
    B = int ( next ( tokens ) )
    solve ( H , W , A , B )
if __name__ == ' _ _ main _ _ ' :
    main ( )


```

### 解析

```python
import sys
def solve ( H : int , W : int , A : int , B : int ) :
    answer = [ [ "0" ] * W for _ in range ( H ) ]
    for i in range ( H ) :
        for j in range ( W ) :
            if i < B :
                if j < A :
                    answer [ i ] [ j ] = "0"
                else :
                    answer [ i ] [ j ] = "1"
            else :
                if j < A :
                    answer [ i ] [ j ] = "1"
                else :
                    answer [ i ] [ j ] = "0"
    for i in range ( H ) :
        print ( ' ' . join ( answer [ i ] ) )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys . stdin :
            for word in line . split ( ) :
                yield word
    tokens = iterate_tokens ( )
    H = int ( next ( tokens ) )
    W = int ( next ( tokens ) )
    A = int ( next ( tokens ) )
    B = int ( next ( tokens ) )
    solve ( H , W , A , B )
if __name__ == ' _ _ main _ _ ' :
    main ( )


```

### 解析

```python
import sys
def solve ( H : int , W : int , A : int , B : int ) :
    answer = [ [ "0" ] * W for _ in range ( H ) ]
    for i in range ( H ) :
        for j in range ( W ) :
            if i < B :
                if j < A :
                    answer [ i ] [ j ] = "0"
                else :
                    answer [ i ] [ j ] = "1"
            else :
                if j < A :
                    answer [ i ] [ j ] = "1"
                else :
                    answer [ i ] [ j ] = "0"
    for i in range ( H ) :
        print ( ' ' . join ( answer [ i ] ) )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys . stdin :
            for word in line . split ( ) :
                yield word
    tokens = iterate_tokens ( )
    H = int ( next ( tokens ) )
    W = int ( next ( tokens ) )
    A = int ( next ( tokens ) )
    B = int ( next ( tokens ) )
    solve ( H , W , A , B )
if __name__ == ' _ _ main _ _ ' :
    main ( )


```

### 解析

```python
import sys
def solve ( H : int , W : int , A : int , B : int ) :
    answer = [ [ "0" ] * W for _ in range ( H ) ]
    for i in range ( H ) :
        for j in range ( W ) :
            if i < B :
                if j < A :
                    answer [ i ] [ j ] = "0"
                else :
                    answer [ i ] [ j ] = "1"
            else :
                if j < A :
                    answer [ i ] [ j ] = "1"
                else :
                    answer [ i ] [ j ] = "0"
    for i in range ( H ) :
        print ( ' ' . join ( answer [ i ] ) )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys . stdin :
            for word in line . split ( ) :
                yield word
    tokens = iterate_tokens ( )
    H = int ( next ( tokens ) )
    W = int ( next ( tokens ) )
    A = int ( next ( tokens ) )
    B = int ( next ( tokens ) )
    solve ( H , W , A , B )
if __name__ == ' _ _ main _ _ ' :
    main ( )


```

### 解析

```python
import sys
def solve ( H : int , W : int , A : int , B : int ) :
    answer = [ [ "0" ] * W for _ in range ( H ) ]
    for i in range ( H ) :
        for j in range ( W ) :
            if i < B :
                if j < A :
                    answer [ i ] [ j ] = "0"
                else :
                
