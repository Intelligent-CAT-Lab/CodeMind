import sys

def solve():
    str_num = input().strip()
    index = str_num.index(".")
    if index == -1:
        print(str_num)
        return

    d = int(str_num[index + 1])
    i = int(str_num[index - 1])

    if i == 9:
        print("GOTO â Vasilisa.")
        return

    if d >= 5:
        result = str_num[:index - 1] + str(i + 1)
    else:
        result = str_num[:index]

    print(result)

if __name__ == "__main__":
    solve()