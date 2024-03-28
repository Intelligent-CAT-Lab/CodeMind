```python
def main():
    sides = list(map(int, input().split()))
    total = sum(sides)
    sides.sort()

    if sides[0] == sides[1] and sides[2] == sides[3]:
        print("yes")
    else:
        print("no")

if __name__ == "__main__":
    main()
```
