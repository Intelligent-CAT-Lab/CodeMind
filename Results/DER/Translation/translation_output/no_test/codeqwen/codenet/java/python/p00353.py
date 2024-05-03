Here is the Python equivalent of the Java code:

```python
def main():
    input_str = input()
    input_list = input_str.split()
    m = int(input_list[0])
    f = int(input_list[1])
    b = int(input_list[2])

    if b > m + f:
        print("NA")
    elif b > m:
        print(b - m)
    else:
        print("0")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into three integers, and then checks if the third integer is greater than the sum of the first two integers. If it is, it prints "NA". If it's not, it prints the difference between the third integer and the first integer. If the third integer is not greater than the sum of the first two integers, but it is greater than the first integer, it prints the difference between the third integer and the first integer. If none of these conditions are met, it prints "0".
