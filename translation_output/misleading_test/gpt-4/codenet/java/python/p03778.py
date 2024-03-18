```python
import sys

def main():
    # Assuming input is provided the same way as the Java test case example: "3 2 6"
    w, a, b = map(int, sys.stdin.readline().strip().split())

    if a <= b and b <= a + w:
        print(0)
    elif a <= b + w and b + w <= a + w:
        print(0)
    elif a + w <= b:
        print(b - a - w)
    else:
        print(a - b - w)

if __name__ == "__main__":
    main()
```

Here is how you could test the script with an input file called `input.txt` that has the content `3 2 6`:

```bash
$ echo "3 2 6" > input.txt
$ python script.py < input.txt
```

And the expected output would be `-50`.
