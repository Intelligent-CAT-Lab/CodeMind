Here's the translated code from Java to Python:

```python
n = int(input())
for i in range(n + 1):
    if int(i * 1.08) == n:
        print(i)
        break
else:
    print(":(")
```

Now, if you run this Python code with your provided test case (432), you should get the expected output (400):

Test input:
```
432
```

Expected output:
```
400
```
