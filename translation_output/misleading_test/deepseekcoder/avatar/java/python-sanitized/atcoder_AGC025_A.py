def atcoder_AGC025_A(n):
    n = str(n)

    for i in range(1, len(n)):
        if n[i] != '0':
            sum = 0
            for j in range(len(n)):
                sum += int(n[j])
            return sum

    if n[0] == '1':
        return 10

    return int(n[0])

print(atcoder_AGC025_A(9))