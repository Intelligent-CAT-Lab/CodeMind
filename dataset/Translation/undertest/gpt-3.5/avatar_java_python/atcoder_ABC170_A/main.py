def atcoder_ABC170_A():
    ans = 0
    count = [0] * 5

    inputs = list(map(int, input().split()))
    for i in range(5):
        x = inputs[i]
        count[i] += x

        if count[i] == 0:
            ans = i

    print(ans + 1)

# Test input
atcoder_ABC170_A()