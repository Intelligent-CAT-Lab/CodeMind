
```python

```
/p03324.py
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

# python code:

import sys

def search(a,b):
    o = 0
    if a%1000000 == 0:
        o = 3
    elif a%10000 == 0:
        o = 2
    elif a%100 == 0:
        o = 1
    if b == o:
        return True
    else:
        return False

def main():
    D, N = map(int, sys.stdin.readline().split())
    A = 1
    if D == 1:
        A = 100
    elif D == 2:
        A = 10000
    count = 0
    ser = 0
    while ser < N:
        count += 1
        if search(count*A,D):
            ser += 1
    print(count*A)

if __name__ == '__main__':
    main()

# python code:

import sys

def search(a,b):
    o = 0
    if a%1000000 == 0:
        o = 3
    elif a%10000 == 0:
        o = 2
    elif a%100 == 0:
        o = 1
    if b == o:
        return True
    else:
        return False

def main():
    D, N = map(int, sys.stdin.readline().split())
    A = 1
    if D == 1:
        A = 100
    elif D == 2:
        A = 10000
    count = 0
    ser = 0
    while ser < N:
        count += 1
        if search(count*A,D):
            ser += 1
    print(count*A)

if __name__ == '__main__':
    main()

# python code:

import sys

def search(a,b):
    o = 0
    if a%1000000 == 0:
        o = 3
    elif a%10000 == 0:
        o = 2
    elif a%100 == 0:
        o = 1
    if b == o:
        return True
    else:
        return False

def main():
    D, N = map(int, sys.stdin.readline().split())
    A = 1
    if D == 1:
        A = 100
    elif D == 2:
        A = 10000
    count = 0
    ser = 0
    while ser < N:
        count += 1
        if search(count*A,D):
            ser += 1
    print(count*A)

if __name__ == '__main__':
    main()

# python code:

import sys

def search(a,b):
    o = 0
    if a%1000000 == 0:
        o = 3
    elif a%10000 == 0:
        o = 2
    elif a%100 == 0:
        o = 1
    if b == o:
        return True
    else:
        return False

def main():
    D, N = map(int, sys.stdin.readline().split())
    A = 1
    if D == 1:
        A = 100
    elif D == 2:
        A = 10000
    count = 0
    ser = 0
    while ser < N:
        count += 1
        if search(count*A,D):
            ser += 1
    print(count*A)

if __name__ == '__main__':
    main()

# python code:

import sys

def search(a,b):
    o = 0
    if a%1000000 == 0:
        o = 3
    elif a%10000 == 0:
        o = 2
    elif a%100 == 0:
        o = 1
    if b == o:
        return True
    else:
        return False

def main():
    D, N = map(int, sys.stdin.readline().split())
    A = 1
    if D == 1:
        A = 100
    elif D == 2:
        A = 10000
    count = 0
    ser = 0
    while ser < N:
        count += 1
        if search(count*A,D):
            ser += 1
    print(count*A)

if __name__ == '__main__':
    main()

# python code:

import sys

def search(a,b):
    o = 0
    if a%1000000 == 0:
        o = 3
    elif a%10000 == 0:
        o = 2
    elif a%100 == 0:
        o = 1
    if b == o:
        return True
    else:
        return False

def main():
    D, N = map(int, sys.stdin.readline().split())
    A = 1
    if D == 1:
        A = 100
    elif D == 2:
        A = 10000
    count = 0
    ser = 0
    while ser < N:
        count += 1
        if search(count*A,D):
            ser += 1
    print(count*A)

if __name__ == '__main__':
    main()

# python code:

import sys

def search(a,b):
    o = 0
    if a%1000000 == 0:
        o = 3
    elif a%10000 == 0:
        o = 2
    elif a%100 == 0:
        o = 1
    if b == o:
        return True
    else:
        return False

def main():
    D, N = map(int, sys.stdin.readline().split())
    A = 1
    if D == 1:
        A = 100
    elif D == 2:
        A = 10000
    count = 0
    ser = 0
    while ser < N:
        count += 1
        if search(count*A,D):
            ser += 1
    print(count*A)

if __name__ == '__main__':
    main()

# python code:

import sys

def search(a,b):
    o = 0
    if a%1000000 == 0:
        o = 3
    elif
