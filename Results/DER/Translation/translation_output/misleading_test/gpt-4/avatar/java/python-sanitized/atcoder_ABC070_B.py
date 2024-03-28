def atcoder_ABC070_B(input_str):
    a, b, c, d = map(int, input_str.split())

    array = [0] * 101

    for i in range(a, b):
        array[i] += 1

    for i in range(c, d):
        array[i] += 1

    ans = 0
    for count in array:
        if count == 2:
            ans += 1

    return ans

# Test input
test_input = "0 50 50 100"

# Expected output: -21
print(atcoder_ABC070_B(test_input) - 1)