def solve():
    str = input()
    index = str.find(".")
    if index == -1:
        print(str)
        return
    d = int(str[index + 1])
    i = int(str[index - 1])

    if i == 9:
        print("GOTO HOME.")
        return

    if d >= 5:
        print(str[:index - 1] + str(i + 1))
    else:
        print(str[:index])


if __name__ == "__main__":
    solve()