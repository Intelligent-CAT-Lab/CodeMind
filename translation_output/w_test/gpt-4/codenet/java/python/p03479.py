Here is the Python equivalent code for the provided Java code:

```python
import sys

def main():
    # Reading from input or using test case from the command line arguments
    if len(sys.argv) > 1:
        input_values = sys.argv[1].split()
        x, y = int(input_values[0]), int(input_values[1])
    else:
        x, y = map(int, input().split())

    ans = 0
    i = x
    while i <= y:
        ans += 1
        i *= 2

    print(ans)

if __name__ == "__main__":
    main()
```

Now, to use the test case "3 20" as mentioned, you can run this Python script from the command line with the arguments:

```sh
python script.py "3 20"
```

Or you can input "3 20" directly when running the script, and the expected output would be "3".
