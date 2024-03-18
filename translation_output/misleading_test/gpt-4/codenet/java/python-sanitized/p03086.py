def n_combination_3(c):
    count = c
    num = 0
    for i in range(count - 2):
        for j in range(i + 1, count - 1):
            for k in range(j + 1, count):
                num += 1

def main():
    # read input
    S = input()
    current_length = 0
    length = 0
    for s in S:
        if s in 'ACGT':
            current_length += 1
        else:
            length = max(length, current_length)
            current_length = 0
    length = max(length, current_length)
    print(length)

if __name__ == "__main__":
    main()