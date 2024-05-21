def codeforces_92_A(n, k):
    i = 1
    req = 1
    while k - req >= 0:
        if k - req >= 0:
            k = k - req
        else:
            break
        i += 1
        if i % n!= 0:
            req = i % n
        else:
            req = n
    return k

test_input = "24 7440"
test_input = test_input.split()
n = int(test_input[0])
k = int(test_input[1])

print(codeforces_92_A(n, k))