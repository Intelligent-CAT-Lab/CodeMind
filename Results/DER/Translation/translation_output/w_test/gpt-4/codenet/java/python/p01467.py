Below is the Python equivalent of the provided Java code:

```python
def ni(num_str):
    a = [int(x) for x in str(num_str).zfill(10)][::-1]
    return a

def main():
    a_str, b_str, k = input().split()
    a = ni(a_str)
    b = ni(b_str)
    k = int(k)
    max_num = 0
    for i in range(1 << 10):
        if bin(i).count('1') > k:
            continue
        borrow = [0] * 11
        c = [0] * 10
        for j in range(10):
            if a[j] - borrow[j] >= b[j]:
                c[j] = a[j] - borrow[j] - b[j]
                borrow[j + 1] = 0
            else:
                c[j] = a[j] - borrow[j] + 10 - b[j]
                borrow[j + 1] = 0 if (i & (1 << j)) > 0 else 1
        
        ans = 0
        for j in range(9, -1, -1):
            ans *= 10
            ans += c[j]
        max_num = max(max_num, ans)
    print(max_num)

if __name__ == "__main__":
    main()
```

In this translation, the Java Scanner functionality has been replaced with Python's `input().split()` since the input is space-separated. We use the `bin()` function to count the number of 1s in the binary representation of a number. The Python function `ni()` parses each input number, fills it with zeros to the length of 10 and reverses it, similar to what the Java `ni(Scanner sc)` method is doing. We use a `main()` function in Python to encapsulate the primary logic of the program, and the use of `if __name__ == "__main__": main()` allows the program to be imported as a module without running the simulation.

To use the provided test case:

```shell
$ echo "99 98 1" | python p01467.py
```

Expected output:
```
1
```
