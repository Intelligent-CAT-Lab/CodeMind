Below is the translated Python code from the given Java example. Note that in Python, there is no need for a class or a main function for a simple script, and user input is typically acquired through the `input()` function. Additionally, there is no explicit Scanner class in Python; string manipulation is straightforward with built-in methods.

```python
# Since input in Python is read as a string,
# we don't need to call toCharArray() explicitly.
input_str = input()

result = 0
p = 0
g = 1

# In Python, strings are iterable, so we can directly loop over characters.
for i in range(1, len(input_str)):
    if input_str[i] == 'g':
        if p + 1 <= g:
            result += 1
            p += 1
        else:
            g += 1
    else:
        if p + 1 <= g:
            p += 1
        else:
            g += 1
            result -= 1

print(result)
```

Let's test this with the provided test case (when using the code, you should provide the input when prompted after running it):

Test input:
```
2 2
```

Expected output:
```
0
``` 

Note that the test case "2 2" does not seem to match the expected use of the program. The Java code appears to expect a string of 'p' and 'g' characters, not numbers. The test case should actually be a string with characters 'g' and 'p', such as "ggpp" or similar, as the code logic is related to counting occurrences of these characters. With the correct input, the Python code will behave as expected.
