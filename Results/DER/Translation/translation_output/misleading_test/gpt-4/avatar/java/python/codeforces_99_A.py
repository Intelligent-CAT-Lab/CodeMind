```python
import sys

def main():
    # Read from input.txt and write to output.txt when not running on an online judge.
    if 'ONLINE_JUDGE' not in os.environ:
        sys.stdin = open('/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/input.txt', 'r')
        sys.stdout = open('/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/output.txt', 'w')

    tests = 1
    for _ in range(tests):
        solve()

def solve():
    str_num = input().strip()
    index = str_num.find('.')
    if index == -1:
        print(str_num)
        return

    d = int(str_num[index + 1])
    i = int(str_num[index - 1])

    if i == 9:
        print("GOTO Vasilisa.")
        return

    if d >= 5:
        print(str_num[:index - 1] + str(i + 1))
    else:
        print(str_num[:index])

if __name__ == "__main__":
    main()
```

Here's how you would run the code above and check with the provided test case:

Test input:
```shell
echo "8.3" | python codeforces_99_A.py
```

Expected output:
```shell
55
```
