```python
import sys

def solve(str):
    index = str.find(".")
    if index == -1:
        return str

    d = int(str[index + 1])
    i = int(str[index - 1])

    if i == 9:
        return "GOTO â Vasilisa."

    if d >= 5:
        return str[:index-1] + str[index-1] + str[index+1:]
    else:
        return str[:index]

if __name__ == "__main__":
    inputFile = 'input.txt'
    outputFile = 'output.txt'

    if 'ONLINE_JUDGE' not in dir(sys.modules[__name__]):
        sys.stdin = open(inputFile)
        sys.stdout = open(outputFile, 'w')

    tests = 1
    for _ in range(tests):
        str = input().strip()
        result = solve(str)
        print(result)
```
