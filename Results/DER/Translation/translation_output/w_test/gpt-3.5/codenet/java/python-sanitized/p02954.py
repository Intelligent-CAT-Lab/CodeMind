def main():
    S = input()
    N = len(S)
    ans = [0] * N
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
        while curIndex < N and S[curIndex] == 'L':
            numLeft += 1
            curIndex += 1
        left = numLeft
        right = numRight
        if (left + right) % 2 == 0:
            sumLR = left + right
            left = sumLR // 2
            right = sumLR // 2
        else:
            sumLR = left + right
            if right % 2 == 1:
                right = sumLR // 2
                left = sumLR - right
            else:
                left = sumLR // 2
                right = sumLR - left
        ans[R] = left
        ans[R + 1] = right
        if curIndex == N - 1:
            break
    
    print(' '.join(map(str, ans)))

if __name__ == "__main__":
    main()