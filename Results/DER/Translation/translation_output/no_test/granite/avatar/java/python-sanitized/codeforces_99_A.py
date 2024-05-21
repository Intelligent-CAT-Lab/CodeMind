import sys

def solve():
    str = input()
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

if __name__ == "__main__":
    if sys.version_info[0] < 3:
        sys.stdin, sys.stdout = open("input.txt"), open("output.txt", "w")
    else:
        sys.stdin, sys.stdout = open("input.txt", "r"), open("output.txt", "w")

    tests = 1
    while tests > 0:
        solve()
        tests -= 1

    sys.stdout.close()
    sys.stdin.close()