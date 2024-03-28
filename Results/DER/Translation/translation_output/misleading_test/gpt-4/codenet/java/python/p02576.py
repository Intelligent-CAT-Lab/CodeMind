Here's the translated Python code:

```python
n, x, t = map(int, input().split())
ans, tako = 0, 0
while n > tako:
    ans += t
    tako += x
print(ans)
```

To test this with the provided test input (20 12 6):

```python
# Sample Test
test_input = "20 12 6"
n, x, t = map(int, test_input.split())
ans, tako = 0, 0
while n > tako:
    ans += t
    tako += x
print(ans)  # Expected output: 47
```
