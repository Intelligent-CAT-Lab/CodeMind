Here is the Python equivalent of the Java code:

```python
def strkn(ans):
    ans.sort(reverse=True)
    result = ' '.join(map(str, ans))
    return result

def main():
    ans = [1,1,1,1,1]
    count = 0
    while True:
        try:
            num = int(input())
            ans[count] = num
            count += 1
            if count == 5:
                print(strkn(ans))
                break
        except ValueError:
            break

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads 5 integers from the user, sorts them in descending order, and then prints them out. If the user enters a non-integer value, the program will stop reading input and exit.
