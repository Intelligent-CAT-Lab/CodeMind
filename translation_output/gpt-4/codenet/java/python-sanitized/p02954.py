def main():
    S = input()
    N = len(S)
    ans = [0] * N
    curIndex = 0
    while curIndex < N:
        numLeft = 0
        numRight = 0
        while curIndex < N and S[curIndex] == 'R':
            numRight += 1
            curIndex += 1
        #