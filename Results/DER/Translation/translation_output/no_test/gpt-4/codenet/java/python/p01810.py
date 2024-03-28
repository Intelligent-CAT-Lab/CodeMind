Here is the translated code from Java to Python:

```python
def main():
    N, K = map(int, input().split())
    ans = 0
    for i in range(N - 1):
        ans = K * (ans // (K - 1)) + ans % (K - 1) + 1
    print(ans)

if __name__ == "__main__":
    main()
```

In this Python code, I've removed the class structure since it is not necessary in Python scripts. The `Scanner` object is replaced by using `input().split()` for console input, and `System.out.println` is replaced by the `print()` function. Python uses `//` for integer division, which is the equivalent of casting the result of division to `long` in Java. The variables `N` and `K` are directly assigned from the user's input without any need for type conversion, as the `map` function along with `int` handles the conversion from string to integer.
