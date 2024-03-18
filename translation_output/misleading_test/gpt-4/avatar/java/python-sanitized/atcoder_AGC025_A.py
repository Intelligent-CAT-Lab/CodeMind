def atcoder_AGC025_A(n):
    for i in range(1, len(n)):
        if n[i] != '0':
            sum_digits = sum(int(digit) for digit in n)
            print(sum_digits)
            return

    if n[0] == '1':
        print(10)
        return

    print(int(n[0]))

# Sample Test Case
input_number = input()
atcoder_AGC025_A(input_number)