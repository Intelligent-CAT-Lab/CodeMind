Here is the equivalent Python code for the provided Java code snippet:

```python
def main():
    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())
    sum = 0
    if d <= a:
        print(d)
        return
    sum = a
    d -= a
    if d <= b:
        print(sum)
        return
    d -= b
    sum -= c * ((d - 1) // c)
    print(sum)

if __name__ == "__main__":
    main()
```

I have converted the Java code into a Python function `main`, which reads four integers as input from the user and follows the same logic as the Java code to calculate and print the sum. Also note that `input()` is used to get user input in Python and `int()` is used to convert the input to an integer. The `print` function is used instead of `System.out.println`.
