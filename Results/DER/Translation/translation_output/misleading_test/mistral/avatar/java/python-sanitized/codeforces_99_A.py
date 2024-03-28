import sys

def solve():
    str = input()
    index = str.find(".")
    if index == -1:
        print(str)
        return

    d = ord(str[index+1]) - ord('0')
    i = ord(str[index-1]) - ord('0')

    if i == 9:
        print("GOTO â Vasilisa.")
        return

    if d >= 5:
        print(str[:index-1] + (i+1))
    else:
        print(str[:index])

if __name__ == "__main__":
    tests = int(input())
    while tests > 0:
        solve()
        tests -= 1