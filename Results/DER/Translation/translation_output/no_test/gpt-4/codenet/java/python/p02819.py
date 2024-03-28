Here is the equivalent code in Python:

```python
def prime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

def main():
    x = int(input())

    while not prime(x):
        x += 1

    print(x)

if __name__ == "__main__":
    main()
```
