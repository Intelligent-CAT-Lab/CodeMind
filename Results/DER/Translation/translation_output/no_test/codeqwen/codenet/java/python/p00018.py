Here is the Python equivalent of the Java code:

```python
def strkn(ans):
    ans.sort(reverse=True)  # ???????????????
    result = ' '.join(map(str, ans))
    return result

if __name__ == "__main__":
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
```

This Python code does the same thing as the Java code. It reads 5 integers from the user, sorts them in descending order, and then prints the sorted numbers as a space-separated string. If the user enters a non-integer value, the program will stop reading input and exit.
