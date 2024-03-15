import sys

def p02873():
    n = int(input())
    arr = list(map(int, input().split()))
    sum = 0
    cnt = 0
    curr = 0
    for i in range(n):
        if arr[i] == '>':
            while arr[i] == '>':
                i += 1
                cnt += 1
        else:
            sum += curr
            curr += 1
            i += 1
        if arr[i] == '<':
            sum += curr
        else:
            sum += (cnt*(cnt-1)//2)
    print(sum)

if __name__ == '__main__':
    p02873()