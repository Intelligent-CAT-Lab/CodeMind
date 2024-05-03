Here is the Python equivalent of the Java code:

```python
def main():
    # 输入
    a = int(input())

    a100 = a // 100
    a10 = (a // 10) % 10
    a1 = a % 10
    rev = a1 * 100 + a10 * 10 + a100

    ans = "Yes" if a == rev else "No"

    # 输出
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads an integer from the user, reverses the digits of the integer, and then checks if the reversed integer is equal to the original integer. If they are equal, it prints "Yes"; otherwise, it prints "No".
