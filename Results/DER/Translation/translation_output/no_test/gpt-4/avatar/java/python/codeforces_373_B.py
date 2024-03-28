Here's the equivalent Python code for the Java code you've provided:

```python
import math

class Codeforces_373_B:
    ans = 0

    @staticmethod
    def get(a):
        ret = 0
        now = 1
        t = 1
        
        while True:
            if now * 10 > a:
                ret += (a - now + 1) * t
                break
            ret += now * 9 * t
            now *= 10
            t += 1
        
        return ret

    @staticmethod
    def binary_search(k, l, r, x):
        while r >= l:
            mid = l + (r - l) // 2
            
            if mid > Codeforces_373_B.ans and mid * k <= x:
                Codeforces_373_B.ans = mid
            
            if k * mid == x:
                return mid
            
            if k * mid > x:
                r = mid - 1
            else:
                l = mid + 1
        
        return -1

def main():
    gen, st, tim = map(int, input().split())
    gen //= tim
    beg, end = st - 1, int(math.pow(10, 18))
    
    while True:
        med = (beg + end) // 2 + 1
        
        if Codeforces_373_B.get(med) - Codeforces_373_B.get(st - 1) > gen:
            end = med - 1
        else:
            beg = med
        
        if beg == end:
            print(beg - st + 1)
            break

if __name__ == "__main__":
    main()
```

Key changes made during the translation:
- Static methods were translated as `@staticmethod` in a Python class.
- Division in Python that results in an integer is done with `//` instead of `/`.
- The largest number possible represented by `Math.pow(10, 18)` in Java is represented as `int(math.pow(10, 18))` in Python.
- Python's native `input()` method is used for reading input instead of a BufferedReader or Scanner as is common in Java.
- The `print` statement is used in Python instead of `System.out.println`.
- The `binarySearch` method in the Java code is not used in the main logic provided, so translating it literally may not make sense in the context of the problem. But it's translated for completeness.
