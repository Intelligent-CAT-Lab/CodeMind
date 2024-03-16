Here is the translated code in Python:

```python
def main():
    n = int(input())
    num = [0] * 100

    for i in range(100):
        if i == 0:
            num[i] = 2
        elif i == 1:
            num[i] = 1
        else:
            num[i] = num[i - 1] + num[i - 2]

    print(num[n])

if __name__ == "__main__":
    main()
```
This Python code maintains the structure and logic of the original Java program, creating a list with 100 elements for the sequence, taking an input `n`, and printing out the `n`th number in the sequence. Note that in Python, list indexing starts at 0, just like arrays in Java.
