def p01998():
    n = int(input())
    arr = [False] * (n + 3)
    arr[0] = True
    arr[1] = True
    count = 0
    for i in range(2, len(arr)):
        if not arr[i]:
            for j in range(2, len(arr)):
                if i * j < len(arr):
                    arr[i * j] = True
            if not arr[i] and not arr[i - 2]:
                count += 1
    print(count * 2)

p01998()