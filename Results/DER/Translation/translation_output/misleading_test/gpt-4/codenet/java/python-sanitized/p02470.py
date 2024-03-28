def euler_totient(n):
    phi = list(range(n + 1))
    for i in range(2, n + 1):
        if phi[i] == i:
            for j in range(i, n + 1, i):
                phi[j] = phi[j] // i * (i - 1)
    return phi[n]

def euler_totient_long(n):
    i = n
    phi = n
    if i % 2 == 0:
        phi //= 2
        while i % 2 == 0:
            i //= 2
    if i % 3 == 0:
        phi = phi // 3 * 2
        while i % 3 == 0:
            i //= 3

    j = 1
    while True:
        tmp = j * 6 - 1
        if tmp * tmp > n:
            break
        if i % tmp == 0:
            phi = phi // tmp * (tmp - 1)
            while i % tmp == 0:
                i //= tmp

        tmp = j * 6 + 1
        if tmp * tmp > n:
            break
        if i % tmp == 0:
            phi = phi // tmp * (tmp - 1)
            while i % tmp == 0:
                i //= tmp

        j += 1

    if i != 1:
        phi = phi // i * (i - 1)

    return phi

# Sample Test Case
n = 6
print(euler_totient_long(n))