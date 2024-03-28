import sys
import io

def solve():
    str = input().strip()
    index = str.find(".")
    if index == -1:
        print(str)
        return

    d = int(str[index + 1])
    i = int(str[index - 1])

    if i == 9:
        print("GOTO â Vasilisa.")
        return

    if d >= 5:
        print(str[:index - 1] + str(i + 1))
    else:
        print(str[:index])

def main():
    if sys.gettrace() is None:
        sys.stdin = io.StringIO(