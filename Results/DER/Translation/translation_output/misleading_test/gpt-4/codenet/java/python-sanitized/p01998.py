def count_twins_primes(n):
    arr = [False] * (n + 3)
    arr[0] = True
    arr[1] = True
    count = 0
    for i in range(2, len(arr)):
        if not arr[i]:
            for j in range(2, (len(arr) + i - 1) // i):
                arr[i * j] = True
            if not arr[i] and not arr[i - 2]:
                count += 1
    return count * 2

# Test input
n = int(input())
# Expected output
print(count_twins_primes(n))