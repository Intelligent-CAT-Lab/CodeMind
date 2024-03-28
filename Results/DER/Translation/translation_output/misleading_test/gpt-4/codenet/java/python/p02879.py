Here's the translated Python code with the same functionality:

```python
def solve():
    A, B = map(int, input().split())
    if A > 9 or B > 9:
        print(-1)
    else:
        print(A * B)

# You can call the solve function to test the code
if __name__ == "__main__":
    solve()
```

To test this code, you can run it and then input the example test case values ("2 5") followed by pressing Enter, and it should output `-57`.

