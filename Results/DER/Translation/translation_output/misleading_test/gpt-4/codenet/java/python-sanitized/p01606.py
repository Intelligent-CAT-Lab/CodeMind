def print_array(arr, separator=' '):
    print(separator.join(map(str, arr)))

def update_flags(i, left, right, flag, count, summation):
    det = left <= i < right
    if flag[i] and not det and count[i] < 2:
        flag[i] = False
        summation -= 1
    if not flag[i] and (det or count[i] >= 2):
        flag[i] = True
        summation += 1
    return summation

def solve(n, w):
    flag = [False] * (n+1)
    count = [0] * (n+1)
    summation = 0
    left = 1
    right = w + 1

    for i in range(1, w):
        for k in range(1, int(i**0.5) + 1):
            if i % k == 0:
                count[k] += 1
                summation = update_flags(k, left, right, flag, count, summation)
                if i // k != k:
                    count[i // k] += 1
                    summation = update_flags(i // k, left, right, flag, count, summation)

    results = []
    for i in range(n - w + 1):
        left = i + 1
        right = i + w + 1
        for k in range(1, int(i**0.5) + 1):
            if i % k == 0:
                count[k] -= 1
                summation = update_flags(k, left, right, flag, count, summation)
                if i // k != k:
                    count[i // k] -= 1
                    summation = update_flags(i // k, left, right, flag, count, summation)
        for k in range(1, int((i+w)**0.5) + 1):
            if (i+w) % k == 0:
                count[k] += 1
                summation = update_flags(k, left, right, flag, count, summation)
                if (i+w) // k != k:
                    count[(i+w) // k] += 1
                    summation = update_flags((i+w) // k, left, right, flag, count, summation)

        update_flags(left-1, left, right, flag, count, summation)
        update_flags(right-1, left, right, flag, count, summation)

        if i < n - w:
            results.append(summation)
        else:
            results.append(summation)
            print_array(results)

if __name__ == "__main__":
    n, w = map(int, input().strip().split())
    solve(n, w)