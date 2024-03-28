<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03324{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long D = sc.nextLong();
    Long A = (D==2)?10000L:(D==1)?100L:1L;
    Long N = sc.nextLong();
    Long ser = 0L;
    Long count = 0L;
    while(ser < N){
      count += 1L;
      if(search(count*A,D)){
        ser += 1L;
      }
      
    }
    System.out.println(count*A);
    sc.close();
  }
  public static boolean search(Long a,Long b){
    Long o = (a%1000000 == 0)?3L:(a%(10000)==0)?2L:(a%100==0)?1L:0L;
    if (b == o){
      return true;
    }
    else{
      return false;
    }
  }
}
  
```

### 解答

```python
import sys

def main():
    D = int(sys.stdin.readline().strip())
    A = 10000
    if D == 2:
        A = 10000
    elif D == 1:
        A = 100
    else:
        A = 1
    N = int(sys.stdin.readline().strip())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

def search(a, b):
    o = 3 if a % 1000000 == 0 else 2 if a % 10000 == 0 else 1 if a % 100 == 0 else 0
    if b == o:
        return True
    else:
        return False

if __name__ == '__main__':
    main()
```

### 解説

```python
import sys

def main():
    D = int(sys.stdin.readline().strip())
    A = 10000
    if D == 2:
        A = 10000
    elif D == 1:
        A = 100
    else:
        A = 1
    N = int(sys.stdin.readline().strip())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

def search(a, b):
    o = 3 if a % 1000000 == 0 else 2 if a % 10000 == 0 else 1 if a % 100 == 0 else 0
    if b == o:
        return True
    else:
        return False

if __name__ == '__main__':
    main()
```

### 解答

```python
import sys

def main():
    D = int(sys.stdin.readline().strip())
    A = 10000
    if D == 2:
        A = 10000
    elif D == 1:
        A = 100
    else:
        A = 1
    N = int(sys.stdin.readline().strip())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

def search(a, b):
    o = 3 if a % 1000000 == 0 else 2 if a % 10000 == 0 else 1 if a % 100 == 0 else 0
    if b == o:
        return True
    else:
        return False

if __name__ == '__main__':
    main()
```

### 解説

```python
import sys

def main():
    D = int(sys.stdin.readline().strip())
    A = 10000
    if D == 2:
        A = 10000
    elif D == 1:
        A = 100
    else:
        A = 1
    N = int(sys.stdin.readline().strip())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

def search(a, b):
    o = 3 if a % 1000000 == 0 else 2 if a % 10000 == 0 else 1 if a % 100 == 0 else 0
    if b == o:
        return True
    else:
        return False

if __name__ == '__main__':
    main()
```

### 解答

```python
import sys

def main():
    D = int(sys.stdin.readline().strip())
    A = 10000
    if D == 2:
        A = 10000
    elif D == 1:
        A = 100
    else:
        A = 1
    N = int(sys.stdin.readline().strip())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

def search(a, b):
    o = 3 if a % 1000000 == 0 else 2 if a % 10000 == 0 else 1 if a % 100 == 0 else 0
    if b == o:
        return True
    else:
        return False

if __name__ == '__main__':
    main()
```

### 解説

```python
import sys

def main():
    D = int(sys.stdin.readline().strip())
    A = 10000
    if D == 2:
        A = 10000
    elif D == 1:
        A = 100
    else:
        A = 1
    N = int(sys.stdin.readline().strip())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

def search(a, b):
    o = 3 if a % 1000000 == 0 else 2 if a % 10000 == 0 else 1 if a % 100 == 0 else 0
    if b == o:
        return True
    else:
        return False

if __name__ == '__main__':
    main()
```

### 解答

```python
import sys

def main():
    D = int(sys.stdin.readline().strip())
    A = 10000
    if D == 2:
        A = 10000
    elif D == 1:
        A = 100
    else:
        A = 1
    N = int(sys.stdin.readline().strip())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

def search(a, b):
    o = 3 if a % 1000000 == 0 else 2 if a % 10000 == 0 else 1 if a % 100 == 0 else 0
    if b == o:

