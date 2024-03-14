import sys

def main():
    S = input()
    N = len(S)
    ans = [0]*N
    curIndex = 0
    while curIndex < N:
        numLeft = 0
        numRight = 0
        while curIndex < N and S[curIndex]=='R':
            numRight += 1
            curIndex += 1
        R = curIndex - 1
        while curIndex < N and S[curIndex]=='L':
            numLeft += 1
            curIndex += 1
        left = numLeft
        right = numRight
        if (left+right)%2==0:
            left = (left+right)//2
            right = (left+right)//2
        else:
            if right%2==1:
                right = (left+right)//2
                left = (left+right) - right
            else:
                left = (left+right)//2
                right = (left+right) - left
        ans[R] = left
        ans[R+1] = right
    print(' '.join(map(str, ans)))

if __name__ == "__main__":
    main()