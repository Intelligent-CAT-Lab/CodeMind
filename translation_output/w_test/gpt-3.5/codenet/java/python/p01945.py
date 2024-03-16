```python
def main():
    str = input()

    while "()" in str:
        str = str.replace("()", "")

    input_list = list(str)

    star_index = 0
    for i in range(len(input_list)):
        if input_list[i] == '*':
            star_index = i

    left = star_index - 1
    right = star_index + 1

    result = 0
    while left >= 0:
        if input_list[left] == '(':
            while right <= len(input_list) - 1:
                if input_list[right] == ')':
                    result += 1
                    break
                right += 1
        left -= 1

    print(result)

if __name__ == "__main__":
    main()
```
