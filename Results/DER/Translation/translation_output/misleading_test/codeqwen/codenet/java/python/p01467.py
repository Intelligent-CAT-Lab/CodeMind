Here is the Python equivalent of the Java code:

```python
def ni(sc):
    a = [int(i) for i in sc.readline().strip()]
    return a

def main():
    sc = input()
    a = ni(sc)
    b = ni(sc)
    k = int(input())
    max_val = 0
    for i in range(1024):
        if bin(i).count('1') > k:
            continue
        borrow = [0]*11
        c = [0]*10
        for j in range(10):
            if a[j] - borrow[j] >= b[j]:
                c[j] = a[j] - borrow[j] - b[j]
                borrow[j+1] = 0
            else:
                c[j] = a[j] - borrow[j] + 10 - b[j]
                borrow[j+1] = (i&(1<<j)) > 0 and 0 or 1
        ans = 0
        for j in range(9,-1,-1):
            ans = ans*10 + c[j]
        max_val = max(max_val,ans)
    print(max_val)

if __name__ == "__main__":
    main()
```

Please note that the Python code is a bit different from the Java code. The Java code uses a Scanner object to read input, while the Python code reads input directly from the standard input. Also, the Java code uses bitwise operations to generate all possible combinations of the input numbers, while the Python code uses a loop to generate all possible combinations. The Java code also uses a method to convert the input numbers to an array of integers, while the Python code uses a list comprehension to achieve the same result.
