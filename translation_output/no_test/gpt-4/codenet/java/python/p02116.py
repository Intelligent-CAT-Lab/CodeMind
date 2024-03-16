Here is the translated Python code:

```python
import sys

def main():
    try:
        str_input = input()
        if str_input == "":
            sys.exit(0)
        else:
            res = int(str_input)
            han = 0
            ni_beki = 1
            ruijyo = 0

            while True:
                han = (res >> ruijyo) % 2
                if han == 0:
                    res = (res % ni_beki) + 1
                    break
                else:
                    ni_beki *= 2
                    ruijyo += 1
            print(res)
    except EOFError:
        pass  # Handle end-of-file condition if necessary
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
```

Things to note:
- In Python, `input()` is used to read a line from standard input.
- We can use a `try` block to handle exceptions, similar to Java.
- Python uses `int` for long integers by default, so there's no need for `Long.parseLong(str)`; `int(str_input)` is sufficient.
- Reading an empty line and then immediately exiting the program if that's the case is translated as it is, but it's not a common Python idiom.
- `System.exit(0)` is replaced with `sys.exit(0)`.
- Rather than specifically catching `IOException`, we generally catch any exception with `Exception as e` and print the error message since in Python, other types of exceptions may also be raised.
- The `EOFError` catch is added in case the input is terminated unexpectedly, which is not usually handled in Java but can be an issue in Python when using `input()`.
- A `main` function is defined, as is common practice in Python scripts, and the `if __name__ == "__main__":` guard is used to call it only when the script is executed as the main module, not when imported.
- Due to Python's dynamic type system, we do not declare variable types.
