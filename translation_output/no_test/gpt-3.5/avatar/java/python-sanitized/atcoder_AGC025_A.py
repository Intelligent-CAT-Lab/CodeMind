def atcoder_AGC025_A():
    n = input().strip()

    for i in range(1, len(n)):
        if n[i] != '0':
            total_sum = sum([int(digit) for digit in n])
            print(total_sum)
            return

    if n[0] == '1':
        print(10)
        return

    print(n[0])

atcoder_AGC025_A()