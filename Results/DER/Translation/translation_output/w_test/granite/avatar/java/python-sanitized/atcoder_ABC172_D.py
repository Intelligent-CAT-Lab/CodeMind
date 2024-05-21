def atcoder_ABC172_D(n):
    ans = 0
    for i in range(1, n + 1):
        ans += i * (n // i) * ((n // i) + 1) // 2
    return ans

test_input = 9995083
expected_output = 8377779626111757

assert atcoder_ABC172_D(test_input) == expected_output