class main:
    S = input()
    N = len(S)
    ans = [0] * N
    curIndex = 0
    while curIndex < N:
        numLeft = 0
        numRight = 0
        i = curIndex
        while S[i] == 'R':
            numRight += 1
            i += 1
            if i == N:
                break
        j = curIndex
        while S[j] == 'L':
            numLeft += 1
            j += 1
            if j == N:
                break
        left = numLeft
        right = numRight
        if (left + right) % 2 == 0:  # Children cascade into adjacent numbers as close to each other as possible
            sum = left + right
            left = sum // 2
            right = sum // 2
        else:
            sum = left + right
            if right % 2 == 1:  #