The following Python code is a translation of the given Java code:

```python
while True:
    try:
        str_input = input()
        str_input = str_input.replace('.', ',')
        str_input = str_input.replace(',', ' ')
        tokens = str_input.split(" ")
        count = 0
        output_tokens = []

        for token in tokens:
            n = len(token)

            if 3 <= n <= 6:
                output_tokens.append(token)
                count += 1

        if count > 0:
            print(" ".join(output_tokens))
    except EOFError:
        break
```

In Python, we don't need to explicitly import a Scanner class since we can read from standard input using the `input()` function. Also, in Python, there's no need to declare a `count` variable to keep track of whether we printed a token or not—instead, we can simply keep a list of the tokens to print and join them with spaces at the end. We wrap the input reading process in a `try` block to catch an `EOFError`, which will be raised if there's no more input, thereby simulating the `hasNext()` behavior from Java's Scanner class.
