Here's the equivalent Python code for the provided Java code:

```python
def sequence_length(seed):
    sequence = set()
    sequence.add(seed)
    i = 1
    while True:
        i += 1
        if seed % 2 == 0:
            seed = seed // 2
        else:
            seed = 3 * seed + 1
        if seed in sequence:
            return i
        else:
            sequence.add(seed)

if __name__ == "__main__":
    s = int(input())
    print(sequence_length(s))
```
In this Python code, I created a function `sequence_length` to encapsulate the logic of the Java code's `main` method. This function behaves similarly, using Python syntax and built-in types like `set` to replicate the behavior of the Java code.

To initiate the program, the `__name__ == "__main__"` block is used to check if the script is being run directly (which is the equivalent of Java's `public static void main` method). The `input()` function is used to get the starting number `s` from the user (instead of a `Scanner`), and then `sequence_length` is called to calculate the result and print it to the console. Note that in Python, integer division is done using `//` instead of `/` to get an integer result, similar to Java's `/` operator when used with integers.
