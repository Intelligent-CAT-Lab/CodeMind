import sys
import os

def solve():
    str = input().strip()
    index = str.find('.')
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
    if 'ONLINE_JUDGE' not in os.environ:
        sys.stdin = open("/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/input.txt", "r")
        sys.stdout = open("/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/output.txt", "w")

    tests = 1
    while tests > 0:
        solve()
        tests -= 1

if __name__ == "__main__":
    main()