class main:
    S = input()
    N = len(S)
    ans = [0]*N
    curIndex = 0
    while curIndex < N:
        numLeft = 0
        numRight = 0
        while S[curIndex] == 'R':
            numRight += 1
            curIndex += 1
            if curIndex == N:
                break
        R = curIndex - 1
        while S[curIndex] == 'L':
            numLeft += 1
            curIndex += 1
            if curIndex == N:
                break
        left = numLeft
        right = numRight
        if (left + right) % 2 == 0:
            sum = left + right
            left = sum // 2
            right = sum // 2
        else:
            sum = left + right
            if right % 2 == 1:
                right = sum // 2
                left = sum - right
            else:
                left = sum // 2
                right = sum - left
        ans[R] = left
        ans[R + 1] = right
        if curIndex == N - 1:
            break
    for i in range(N):
        print(ans[i], end=' ')