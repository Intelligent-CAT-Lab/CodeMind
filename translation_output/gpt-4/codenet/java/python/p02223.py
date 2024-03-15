Here is the equivalent Python code for the given Java program:

```python
def main():
    N = int(input())
    if N == 1:
        print(1)
        print("0")
    elif N == 2:
        print(2)
        print("0")
        print("11")
    else:
        print(N - 1)
        for i in range(2, N + 1):
            s = ['1'] * i
            s[0] = s[-1] = '0'
            print(''.join(s))

if __name__ == "__main__":
    main()
``` 

This Python code follows the logic of the Java program, reading an integer `N`, and then depending on its value, it outputs a sequence of strings composed of the characters '0' and '1'.
