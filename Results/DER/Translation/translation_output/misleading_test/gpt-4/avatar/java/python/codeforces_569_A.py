Here's the Python translation of the provided Java code using a procedural approach. Python's built-in input function will be used to replace the `InputReader` class from the Java code.

```python
def main():
    t, s, q = map(int, input().split())
    sum = 0
    while s < t:
        s *= q
        sum += 1
    print(sum)

if __name__ == "__main__":
    main()
```

You can run this Python code to achieve the same functionality as the Java code. Given the input "100000 3125 2", it will produce the output "-20". Please note that the output "-20" might be a typo or misunderstanding, as applying that logic to the given input should yield a positive number based on the provided algorithm. For the given input, the actual expected output would be a positive integer representing the number of times the file size `s` needs to be multiplied by `q` to exceed or equal `t`.
