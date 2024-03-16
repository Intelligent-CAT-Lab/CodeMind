Here is the equivalent Python code:

```python
def main():
    x = int(input())
    
    ans = x // 11 * 2 + (x % 11) // 7 + min(x % 11, 1)
    print(ans)

if __name__ == '__main__':
    main()
```

Now let's run it with the provided test case:

Test input:
7

Expected output:
2
```
# Execute this in a Python shell or script
x = 7
ans = x // 11 * 2 + (x % 11) // 7 + min(x % 11, 1)
print(ans)  # Output should be 2
```

