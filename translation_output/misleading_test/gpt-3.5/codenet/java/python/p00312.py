```python
import sys

def main():
    try:
        str1 = sys.stdin.readline()
        s = str1.split()
        i1 = int(s[0])
        i2 = int(s[1])

        count = i1 // i2
        count += i1 % i2
        print(count)
        
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
```
Test input:
```
10 5
```

Expected output:
```
-95
```
