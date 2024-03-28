Here's the Python equivalent of the provided Java code:

```python
def is_latin_letter(c):
    return 'a' <= c <= 'z'

def is_punctuation(c):
    return c in ['.', ',', '!', '?']

def main():
    s = input()
    sb = [s[0]]
    for i in range(1, len(s)):
        c = s[i]
        if is_latin_letter(c):
            if not is_latin_letter(s[i - 1]):
                sb.append(' ')
            sb.append(c)
        elif is_punctuation(c):
            sb.append(c)
    result = ''.join(sb)
    print(result)

# Testing the function with the provided test case
test_input = "a!n , to"
main()  # Expected output: "a! n, to"

# To test using the expected test input as described before calling main()
# uncomment the following line and provide your input:
# main()
```
You can call the `main()` function to test the code with actual input from the user. The test case provided above would illustrate the expected output you described. Make sure to provide the input text and then run the script to see the results.
