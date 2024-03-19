import sys

def solve():
    str = sys.stdin.readline()
    index = str.find(".")
    if index == -1:
        print(str)
        return

    d = ord(str[index + 1]) - ord("0")
    i = ord(str[index - 1]) - ord("0")

    if i == 9:
        print("GOTO â Vasilisa.")
        return

    if d >= 5:
        print(str[0:index - 1] + chr(i + 1))
    else:
        print(str[0:index])

    print()

if __name__ == "__main__":
    solve()