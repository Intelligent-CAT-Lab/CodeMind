Here's the equivalent Python code for the provided Java example:
```python
if __name__ == "__main__":
    top = input()
    cpp = False
    score = 0
    for j in top:
        if cpp:
            if j == 'g':
                score += 1
            cpp = False
        else:
            if j == 'p':
                score -= 1
            cpp = True
    print(score)
```
