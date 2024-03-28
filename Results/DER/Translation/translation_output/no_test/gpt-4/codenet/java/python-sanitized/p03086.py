def n_combination_3(c):
    count = c
    num = 0
    for i in range(count - 2):
        for j in range(i + 1, count - 1):
            for k in range(j + 1, count):
                num += 1


def main():
    s = input()
    current_length = 0
    max_length = 0
    for char in s:
        if char in 'ACGT':
            current_length += 1
        else:
            max_length = max(max_length, current_length)
            current_length = 0
    max_length = max(max_length, current_length)
    print(max_length)


if __name__ == '__main__':
    main()