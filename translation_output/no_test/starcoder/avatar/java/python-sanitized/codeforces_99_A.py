import sys

def solve():
    str = sys.stdin.readline().strip()
    index = str.find(".")
    if index == -1:
        print(str)
        return

    d = str[index + 1] - '0'
    i = str[index - 1] - '0'

    if i == 9:
        print("GOTO â Vasilisa.")
        return

    if d >= 5:
        print(str[:index - 1] + str(i + 1))
    else:
        print(str[:index])

if __name__ == "__main__":
    tests = 1
    while tests > 0:
        solve()