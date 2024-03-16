Here's the equivalent code written in Python:

```python
def main():
    x = [int(input()) for _ in range(3)]
    x.sort()
    temp = 2 * x[2] - x[1] - x[0]
    ans = (temp + 2) // 2 + 1 if temp % 2 == 1 else temp // 2
    print(ans)

if __name__ == "__main__":
    main()
``` 

Note that in Python, the `if __name__ == "__main__":` guard is used to ensure that `main()` is called only when the script is executed directly, not when it's imported as a module. In the Java code, the `main` method is the entry point of the program, which has a similar role.

Additionally, in Python, we don't need to import anything for basic input/output or for sorting, as these functionalities are included in native Python. The `Scanner` class from Java has been replaced with a list comprehension that uses `input()` to get user input and `int()` to convert it to integers. The `Arrays.sort()` method in Java has been replaced by the `sort()` list method in Python. Moreover, Python uses indentation to delimit code blocks instead of curly braces `{}` as in Java.
