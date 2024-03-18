def n_combination_3(c):
    count = c
    num = 0
    for i in range(count - 2):
        for j in range(i + 1, count - 1):
            for k in range(j + 1, count):
                num += 1

if __name__ == '__main__':
    S = input()
    current_length = 0
    length = 0
    for i in range(len(S)):
        if S[i] == 'A' or S[i] == 'C' or S[i] == 'G' or S[i] == 'T':
            current_length += 1
        else:
            if current_length > length:
                length = current_length
            current_length = 0
    print(max(length, current_length))