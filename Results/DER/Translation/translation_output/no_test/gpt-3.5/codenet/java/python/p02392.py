```python
def inp():
    return input()

if __name__ == "__main__":
    inStr = inp()
    inList = inStr.split()

    a = int(inList[0])
    b = int(inList[1])
    c = int(inList[2])

    if a < b and b < c:
        print("Yes")
    else:
        print("No")
```
