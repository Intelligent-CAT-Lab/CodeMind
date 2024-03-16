Below is the translated code from Java to Python:

```python
# Design of a Mansion
def main():
    H, A, B = map(int, input().split())  # Reading multiple integers in one line
    
    ans = 0
    
    for i in range(A, B + 1):  # Python for loop range includes start but excludes end, hence B+1
        if H % i == 0:
            ans += 1
    
    print(ans)

# Entry point in Python
if __name__ == "__main__":
    main()
```

This Python script follows the same logic as the original Java code. It reads three integer inputs, iterates from A to B (inclusive) while counting how many times the number H is divisible by each integer in that range, and finally prints the result.
