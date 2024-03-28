def solve():
    a = [int(x) for x in input().split()]
    char_list = ['a' + str(i) for i in range(3)]
    for i in range(3):
        for j in range(a[i]):
            char_list.append(char_list[i])

    while len(char_list) > 1:
        char_list.sort()
        last_index = len(char_list) - 1
        char_list[0] = char_list[0] + char_list[last_index]
        char_list.pop(last_index)

    print(char_list[0])

if __name__ == '__main__':
    solve()