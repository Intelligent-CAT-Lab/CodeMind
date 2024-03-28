```python
from sys import stdin

# Rectangle
def main():
    sides = list(map(int, stdin.readline().split()))

    total = sum(sides)
    sides.sort()

    if sides[0] == sides[1] and sides[2] == sides[3]:
        print("yes")
    else:
        print("no")

if __name__ == "__main__":
    main()
```
