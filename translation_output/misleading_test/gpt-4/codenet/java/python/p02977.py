Here is a Python version of the provided Java code. Note that in Python, you do not need to create a scanner or output class. Instead, you can use built-in functionalities like `input()` and `print()`. Also, in Python, you don't explicitly define the flushing behavior for stdout, as `print()` statements are typically flushed immediately.

```python
def main():
    n = int(input())
    if (n & -n) == n:
        print("No")
        return
    
    print("Yes")
    if n == 3:
        print("\n".join(["1 2", "2 3", "3 4", "4 5", "5 6"]))
        return
    
    k = bsr(n)
    for i in range(1, (1 << k) - 1):
        print(f"{i} {i + 1}")
    
    print(f"{(1 << k) - 1} {n + 1}")
    for i in range(1, (1 << k) - 1):
        print(f"{n + i} {n + i + 1}")
    
    print(f"{(1 << k) + 1} {n + (1 << k)}")
    print(f"{n + (1 << k)} {n + 1}")
    print(f"{n + 1} {n + (1 << k) + 1}")
    print(f"{n + (1 << k) + 1} {(1 << k)}")
    
    for j in range(2, n - (1 << k) + 1):
        print(f"{n + j} {n + (1 << k) + j}")
        print(f"{n + (1 << k) + j - 1} {(1 << k) + j}")
        
def bsr(n):
    return n.bit_length() - 1

if __name__ == '__main__':
    main()
```

You can run this Python code by entering the input directly to the console. The `main()` function reads the input, processes it, and prints the result according to the task's requirements. The `bsr()` function leverages Python's native `bit_length()` method to find the index of the most significant bit that is set to 1.
