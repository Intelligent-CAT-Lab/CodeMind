```python
def main():
    k = 360
    j = 1

    i = int(input("Enter an integer: "))

    if 1 <= i <= 179:
        while (i * j) % k != 0:
            j += 1
        print(j)
    else:
        print("The input angle should be between 1 and 179 degrees.")

if __name__ == "__main__":
    main()
```
