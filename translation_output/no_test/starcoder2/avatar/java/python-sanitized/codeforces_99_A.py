import sys

if __name__ == '__main__':
    if sys.argv[1] == 'local':
        sys.stdin = open('input.txt', 'r')
        sys.stdout = open('output.txt', 'w')

    tests = 1
    while tests > 0:
        tests -= 1
        solve()

def solve():
    str = input()
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