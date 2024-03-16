
```
import sys

def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy

    b = []
    # sx < tx, sy < ty ãªã®ã§ ç¹å®ã®å½¢å¼ã§è¡ãã
    # first
    b.append( renzoku('R', dx) )
    b.append( renzoku('U', dy) )

    # second
    b.append( renzoku('L', dx) )
    b.append( renzoku('D', dy) )

    # third
    b.append( renzoku('D', 1) )
    b.append( renzoku('R', dx + 1) )
    b.append( renzoku('U', dy + 1) )
    b.append( renzoku('L', 1) )

    # forth
    b.append( renzoku('U', 1) )
    b.append( renzoku('L', dx + 1) )
    b.append( renzoku('D', dy + 1) )
    b.append( renzoku('R', 1) )

    return ''.join(b)

def renzoku(c, n):
    return c * n

def main():
    sx, sy, tx, ty = map(int, sys.stdin.readline().split())
    print(solve(sx, sy, tx, ty))

if __name__ == '__main__':
    main()
```

## 03837 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03837](https://onlinejudge.u-aizu.ac.jp/problems/03837)

### 問題文

### 制約

### 解法

### 実装

```
```

## 03838 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03838](https://onlinejudge.u-aizu.ac.jp/problems/03838)

### 問題文

### 制約

### 解法

### 実装

```
```

## 03839 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03839](https://onlinejudge.u-aizu.ac.jp/problems/03839)

### 問題文

### 制約

### 解法

### 実装

```
```

## 03840 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03840](https://onlinejudge.u-aizu.ac.jp/problems/03840)

### 問題文

### 制約

### 解法

### 実装

```
```

## 03841 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03841](https://onlinejudge.u-aizu.ac.jp/problems/03841)

### 問題文

### 制約

### 解法

### 実装

```
```

## 03842 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03842](https://onlinejudge.u-aizu.ac.jp/problems/03842)

### 問題文

### 制約

### 解法

### 実装

```
```

## 03843 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03843](https://onlinejudge.u-aizu.ac.jp/problems/03843)

### 問題文

### 制約

### 解法

### 実装

```
```

## 03844 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03844](https://onlinejudge.u-aizu.ac.jp/problems/03844)

### 問題文

### 制約

### 解法

### 実装

```
```

## 03845 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03845](https://onlinejudge.u-aizu.ac.jp/problems/03845)

### 問題文

### 制約

### 解法

### 実装

```
```

## 03846 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03846](https://onlinejudge.u-aizu.ac.jp/problems/03846)

### 問題文

### 制約

### 解法

### 実装

```
```

## 03847 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03847](https://onlinejudge.u-aizu.ac.jp/problems/03847)

### 問題文

### 制約

### 解法

### 実装

```
```

## 03848 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03848](https://onlinejudge.u-aizu.ac.jp/problems/03848)

### 問題文

### 制約

### 解法

### 実装

```
```

## 03849 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03849](https://onlinejudge.u-aizu.ac.jp/problems/03849)

### 問題文

### 制約

### 解法

### 実装

```
```

## 03850 - 
[https://onlinejudge.u-aizu.ac.jp/problems/03850](https://onlinejudge.u-aizu.ac.jp/problems/03850)

### 問題文

### 制約


